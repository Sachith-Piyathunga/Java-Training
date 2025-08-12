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
        // Check if the blance is sufficent for the withdraw
        if (balance >= amount) {
            // Decrese the balance by the withdrawal amount
            balance -= amount;
        } else {
            // Print the message
            System.out.println("Insufficent balance");
        }
    }

    // Method to get the currnet balance
    public double getBalance() {
        // Return the current balance
        return balance;
    }
}



// SavingsAccount.java
// Create subclass called savingsaccount
// Declare the SavingsAccount class, inheriting from BankAccount class
/* public */ class SavingsAccount extends BankAccount {
    // Parameterized constructor to initialize the variables
    public SavingsAccount(int accountNumber, double balance) {
        // Call the parent class constructor
        super(accountNumber, balance);
    }

    // Override the withdrawal method from the parent class
    @Override
    public void withdraw(double amount) {
        // Check if the withdrawal would cause the balance to drop below $100
        if (getBalance() - amount < 100) {
            // Print the message
            System.out.println("Minimum balance of $100 required...!");
        } else {
            // Call the parent class withdrawal method
            super.withdraw(amount);
        }
    }
}


// Main class
// Define the JavaInheritance7 class
public class JavaInheritance7 {
    // Main method
    public static void main(String[] args) {
        
    }
}
