/**
 * Constructor with Validation
 * Write a Java program to create a class called Account with instance variables 
 * accountNumber and balance. Implement a parameterized constructor that initializes
 *  these variables with validation:
 * 
 * accountNumber should be non-null and non-empty.
 * balance should be non-negative.
 * Print an error message if the validation fails.
 */

 public class Account {
    
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }

        if (balance < 0 ) {
            System.err.println("Error: Balance cannot be negative.");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }
 }

