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

        // Withdraw an amount from the account
        account.withdraw(500.45);

        // Print tthe details of the account
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());
    }
}


/**
 * Explanation
 * 
 * Private Instance Variables: The accountNumber, accountHolder, and balance variables 
 * are declared as private to ensure encapsulation.
 * 
 * Public Getters and Setters: These methods provide controlled access to the private variables.
 *      getAccountNumber(): Returns the account number.
 *      setAccountNumber(String accountNumber): Sets the account number.
 *      getAccountHolder(): Returns the account holder.
 *      setAccountHolder(String accountHolder): Sets the account holder.
 *      getBalance(): Returns the balance.
 *      setBalance(double balance): Sets the balance.
 * 
 * deposit Method: Takes an amount and increases the balance by that amount if it's positive.
 * 
 * withdraw Method: Takes an amount and decreases the balance by that amount if it's 
 * positive and less than or equal to the current balance.
 * 
 * Main Method: Tests the functionality of the Account class by creating an instance, 
 * setting its properties, performing transactions, and printing the details.
 * 
 */