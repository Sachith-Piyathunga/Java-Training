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

}




public class JavaEncapsulation10 {
    
}
