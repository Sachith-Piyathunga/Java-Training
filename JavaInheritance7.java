/**
 * Write a Java program to create a class known as "BankAccount" with methods called 
 * deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the 
 * withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 */

// BankAccount.java
// Parent class BankAccount
// Declare the BankAccount class
/* public */ class BankAccount {
    // Private field to store the account number
    private int accountNumber;
    // Private feild to store the blance
    private double balance;

    // Parameterized constructor to initialize the veriables
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit the amount into account\
    public void deposit(double amount) {
        // Increse the blance by the deposit amount
        balance += amount;
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        
    }
}

public class JavaInheritance7 {
    
}
