/**
 * Write a Java program to create a class called "Bank" with a collection of accounts and 
 * methods to add and remove accounts, and to deposit and withdraw money. Also define a 
 * class called "Account" to maintain account details of a particular customer.
 */


 // Import the array list class
import java.util.ArrayList;


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
        // Set the balance variable
        this.balance = balance;
    }

    // Method to deposit the specific amount into the account
    public void diposit(double amount) {
        // Increse the balance
        balance += amount;
    }

    // Method to withdraw a specific amount from the account
    public void withdraw(double amount) {
        // Decrece the balance
        balance -= amount;
    }

    // Method to get the account details
    public String getAccountInfo() {
        // Return a string concatinating
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}


/**
 * Explanation
 * 
 * The above class has three private attributes: name, accountNumber and balance. 
 * There are several methods to deposit, withdraw, maintain balance in an individual 
 * account, print account details and more.
 */


// Bank.java
// Define the bank class
/* public */ class Bank {

    // Declare the array list to store account objects
    private ArrayList<Account> accounts;

    // Constructor for the bank class
    public Bank() {
        // Initialize the accounts array list
        accounts = new ArrayList<Account>();
    }

    // Method to add an account to the account list
    public void addAccount(Account account) {
        // Add the given account to the accounts array list
        accounts.add(account);
    }

    // Method to remove an account from the accounts list
    public void removeAccount(Account account) {
        // Remove the given account from theaccounts array list
        accounts.remove(account);
    }

    // Method to deposit some money into account
    public void depositMoney(Account account, double amount) {
        // Call the account deposit method
        account.diposit(amount);
    }

    // Method witharaw some money from the account
    public void withdrawMoney(Account account, double amount) {
        // Call the withdraw method
        account.withdraw(amount);
    }

    // Method get the list of all accouts
    public ArrayList<Account> getAccounts() {
        // Return the accounts array list
        return accounts;
    }
}

/**
 * Explanation
 * 
 * The above class has a private accounts attribute, a constructor that initializes this 
 * attribute as an empty array list. It also has methods to add and remove accounts 
 * from the collection, and to deposit and withdraw money from an account.
 */


//OOP5.java
// Main class
public class OOP5 {
    // Define the main method
    public static void main(String[] args) {
        // Create new bank object
        Bank bank = new Bank();

        // Crete the new accounts objects
        Account account1 = new Account("Sachintha", "C0011", 5000);
        Account account2 = new Account("Chamod", "C0121", 4500);
        Account account3 = new Account("Piyathunga", "C0222", 20000);
    
        // Add the three accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Get the list of accounts from the bank
        ArrayList<Account> accounts = bank.getAccounts();

        // Loop through the accounts in the account list
        for (Account account : accounts) {
            // Print the account details
            System.out.println(account.getAccountInfo());
        }
    
        // Print a message indicating the start deposit
        System.out.println("\nAfter depositing 1000 into account1:");
        // Deposit 1000 into account 1
        bank.depositMoney(account1, 1000);
        // Print the updated account details
        System.out.println(account1.getAccountInfo());

        // Print a message indicating no transaction for the account 2
        System.out.println("No transaction in account 2");
        // Print the account details for the account 2
        System.out.println(account2.getAccountInfo());
        
        // Prin the message indicating the start of a withdrawal transaction
        System.out.println("After withdrawing 5000 from account3:"); 
        // Withdraw the 5000 from account 3
        bank.withdrawMoney(account3, 5000);
        // Print the updated account deatails for account 3
        System.out.println(account3.getAccountInfo());
    }
}


/**
 * Explanation
 * 
 * In the above  code, create an instance of the "Bank" class and three instances of 
 * the "Account" class, and add them to the collection through the ‘addAccount’ method.
 * then print the account information for each account in the collection using a for loop. 
 * also deposit 1000 into account1 using the ‘depositMoney’ method, and withdraw 5000 
 * from account3 using the ‘withdrawMoney’ method. also print the updated account 
 * information. Account2 has no transaction.
 * 
 */