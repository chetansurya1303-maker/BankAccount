public class BankAccount {

    // Instance variables
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Static variable
    public static int totalAccounts = 0;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("\nBank Account Details");
        System.out.println("--------------------");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }

    // Getter - Balance
    public double getBalance() {
        return balance;
    }

    // Setter - Balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    // Getter - Account Number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter - Account Holder
    public String getAccountHolder() {
        return accountHolder;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        // Creating Account 1
        BankAccount account1 =
                new BankAccount(101, "Surya", 5000);

        // Creating Account 2
        BankAccount account2 =
                new BankAccount(102, "Chetan", 10000);


        // Account 1 details
        account1.displayDetails();

        // Deposit
        account1.deposit(2000);

        // Withdraw
        account1.withdraw(1000);

        // Final balance
        System.out.println("Final Balance : "
                + account1.getBalance());


        // Account 2 details
        account2.displayDetails();

        // Deposit
        account2.deposit(500);

        // Withdraw
        account2.withdraw(2000);

        // Final balance
        System.out.println("Final Balance : "
                + account2.getBalance());


        // Testing invalid deposit
        account1.deposit(-500);


        // Testing invalid withdrawal
        account1.withdraw(-100);


        // Testing insufficient balance
        account1.withdraw(100000);


        // Total accounts
        System.out.println("\nTotal Accounts : "
                + BankAccount.totalAccounts);
    }
}