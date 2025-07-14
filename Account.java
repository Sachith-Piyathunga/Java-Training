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

    public static void main(String[] args) {

        Account account1 = new Account("123456789", 10000);
        System.out.println("Account 1 Number is: " + account1.accountNumber);
        System.out.println("Account 1 balance is: " + account1.balance);

        Account account2 = new Account("null", 500);
        System.out.println("Account 1 Number is: " + account2.accountNumber);
        System.out.println("Account 1 balance is: " + account2.balance);
    }
 }

