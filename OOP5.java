/**
 * Write a Java program to create a class called "Bank" with a collection of accounts and 
 * methods to add and remove accounts, and to deposit and withdraw money. Also define a 
 * class called "Account" to maintain account details of a particular customer.
 */


// Account.java
// Define the account class
/* public */ class Account {
    // Declare the private variables
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor for the acoount class
    public Account(String name, String accountNumber, double balance) {
        // Set the variables
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for the name
    public String getName() {
        // Return name
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        // Set the name variable
        this.name = name;
    }

    // Getter method for the account number
    public String getAccountNumber() {
        // Return the account number
        return accountNumber;
    }

    // Setter method for the account number
    public void setAccountNumber(String accountNumber) {
        // Set account number variable
        this.accountNumber = accountNumber;
    }

    // Getter method for the balance
    public double getBalance() {
        // Return balance
        return balance;
    }

    // Setter method for the balance
    public void setBalance(double balance) {
        
    }
}







public class OOP5 {
    
}
