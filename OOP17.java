/**
 * Write a Java program to create a class called "BankAccount" with attributes for 
 * account number, account holder's name, and balance. Include methods for 
 * depositing and withdrawing money, as well as checking the balance. Create a 
 * subclass called "SavingsAccount" that adds an interest rate attribute and a 
 * method to apply interest.
 * 
 */


// Define the BankAccount class
/* public */ class BankAccount {

    // Declare the variable
    private String accountNumber;
    // Declare the variable
    private String accountHolderName;
    // Declare the variable
    private double balance;

    // Constructor for the Bank Account class
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        // Initialize the Account number
        this.accountNumber = accountNumber;
        // Initialize the Account holder name
        this.accountHolderName = accountHolderName;
        // Initialize the balance
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount muust be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        }
    }
}





















public class OOP17 {
    
}
