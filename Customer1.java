import java.util.Scanner;

class Customer {
    private int accountNo;
    private String accName;
    private double balance;

    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance is " + balance);
        notify();  // Notify the waiting thread that balance has been updated
    }

    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait();  // Wait until a deposit is made
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + ". New balance is " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class BankSystem {
    public static void main(String[] args) {
        Customer customer = new Customer(123456, "John Doe", 10000.0);

        Thread withdrawThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            customer.withdraw(amount);
        });

        Thread depositThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            customer.deposit(amount);
        });

        withdrawThread.start();

        // Give some time before starting deposit thread to simulate real scenario
        try {
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        depositThread.start();
    }
}