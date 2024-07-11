class Customer {
    private int accountNo;
    private String accName;
    private int balance;

    public Customer(int accountNo, String accName, int balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        notify();
    }

    public synchronized void withdraw(int amount) {
        while (amount > balance) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        balance -= amount;
        System.out.println("Withdraw operation success, Balance amount: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

public class BankOperations {
    public static void main(String[] args) {
        Customer customer = new Customer(123456, "John Doe", 10000);

        Thread withdrawThread = new Thread(() -> {
            customer.withdraw(12000);
        });

        Thread depositThread = new Thread(() -> {
            customer.deposit(3000);
        });

        withdrawThread.start();
        try {
            Thread.sleep(1000); // Ensure withdraw thread starts first
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }
        depositThread.start();
    }
}
