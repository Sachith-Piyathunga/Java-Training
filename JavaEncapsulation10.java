/**
 * Write a Java program to create a class called Account with private instance 
 * variables accountNumber, accountHolder, and balance. Provide public getter and 
 * setter methods to access and modify these variables. Add a method called deposit() 
 * that takes an amount and increases the balance by that amount, and a method 
 * called withdraw() that takes an amount and decreases the balance by that amount.
 */


// Account.java
// Define the account class
/* public */ class Account {
    // Private instance ariables
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Getter method for the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for the account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for the account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter method for the account holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter method for the balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit an amount and increase the balance
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >+ amount) {
            this.balance -= amount;
        }
    }
}


// JavaEncapsulation10.java
// Main class
public class JavaEncapsulation10 {
    // Main method for test the account class
    public static void main(String[] args) {
        // Create the new object
        Account account = new Account();

        // Set the values
        account.setAccountNumber("123456789");
        account.setAccountNumber("Sachintha Chamod");
        account.setBalance(50000.56);

        // Deposit an amount to the account
        account.deposit(600.2);
    }
}
