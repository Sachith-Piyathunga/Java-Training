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
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check the account balance
    public double checkBalance() {
        return balance;
    }

    // Getter method for the accout balance
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for the account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}


/**
 * Explanation
 * 
 * The above Java code defines a BankAccount class with three attributes: 
 * accountNumber, accountHolderName, and balance. It includes a constructor to 
 * initialize these attributes when an object of this class is created. 
 * The class also provides methods to:
 * 
 *      - Deposit money (deposit): Adds a specified amount to the balance if the amount is positive.
 *      - Withdraw money (withdraw): Subtracts a specified amount from the balance if the amount is 
 *        positive and does not exceed the current balance.
 *      - Check balance (checkBalance): Returns the current balance.
 *      - Get account number (getAccountNumber): Returns the account number.
 *      - Get the account holder's name (getAccountHolderName): Returns the account holder's name.
 * 
 */


// Define the Savings Account class
class SavingsAccount extends BankAccount {

    // Declare the variable
    private double interestRate;

    // Constructor for the savings account
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        // Call the constructor of the super class
        super(accountNumber, accountHolderName, initialBalance);
        // Initialize the interest rate
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        // Calculate the interest
        double interest = checkBalance() * interestRate / 100;
        // Add interest to the balance
        deposit(interest);
        System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter method for the interest rate
    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Interest rate must be positive.");
        }
    }
}


/**
 * Explanation
 * 
 * The above Java code defines a SavingsAccount class that extends the BankAccount 
 * class, inheriting its attributes and methods. The SavingsAccount class adds a new 
 * attribute, interestRate, which represents the interest rate for the savings account. 
 * The class includes:
 * 
 *      - Constructor: Initializes the SavingsAccount object with the account number, 
 *        account holder's name, initial balance, and interest rate by calling the 
 *        superclass (BankAccount) constructor for the common attributes.
 * 
 *      - Method to apply interest (applyInterest): Calculates interest based on the 
 *        current balance and interest rate, then deposits interest into the account.
 * 
 *      - Getter method for interest rate (getInterestRate): Returns the current interest rate.
 * 
 *      - Setter method for interest rate (setInterestRate): Updates the interest rate 
 *        if the provided rate is positive, ensuring it is a valid interest rate.
 * 
 */














public class OOP17 {
    
}
