import java.util.Scanner;

class BankOperations {
    // Data Members
    private String depositorName;
    private String accountNumber;
    private String accountType; // Savings or Current
    private double balance;

    // Constructor
    public BankAccount(String depositorName, String accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance < 500 ? 500 : initialBalance; // Ensuring minimum balance
    }

    // Method to read account details
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        this.accountNumber = scanner.nextLine();

        System.out.print("Enter depositor name: ");
        this.depositorName = scanner.nextLine();

        System.out.print("Enter account type (Savings/Current): ");
        this.accountType = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        this.balance = initialBalance < 500 ? 500 : initialBalance; // Ensuring minimum balance
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount after checking balance
    public void withdraw(double amount) {
        if (amount > 0 && this.balance - amount >= 500) {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds (Minimum balance must be Rs.500).");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Balance amount: Rs." + this.balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Depositor Name: " + this.depositorName);
        System.out.println("Account Type: " + this.accountType);
        displayBalance();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Initialize with a balance of 10000 for testing
        BankAccount account = new BankAccount("Test User", "000000", "Savings", 10000.0);

        // Display initial account details
        account.displayAccountDetails();

        // Reading new account details
        System.out.println("\n--- Enter New Account Details ---");
        account.readAccountDetails();

        // Display the new account details
        account.displayAccountDetails();

        // Depositing an amount
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Display the balance after deposit
        account.displayBalance();

        // Withdrawing an amount
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display the balance after withdrawal
        account.displayBalance();
    }
}