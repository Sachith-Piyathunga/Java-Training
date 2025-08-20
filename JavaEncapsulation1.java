/**
 * Write a Java program to create a class called BankAccount with private instance 
 * variables accountNumber and balance. Provide public getter and setter methods to 
 * access and modify these variables.
 */

// BankAccount.java
// BankAccount class
class BankAccount {
    // Declare a private String variable for account number
    private String accountNumber;
    // Declare a private double variable for balance
    private double balance;

    // Getter method to get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

/**
 * Explanation
 * 
 * In the above code, we have a BankAccount class that encapsulates the private 
 * instance variables accountNumber and balance. 
 * By making these variables private, we ensure that they can only be accessed and 
 * modified through the public getter and setter methods.
 * 
 * The getter methods (getAccountNumber() and getBalance()) are public methods that 
 * provide access to private variables. 
 * They allow other classes to retrieve accountNumber and balance values. 
 * In this case, getAccountNumber() returns the value of accountNumber as a String, 
 * and getBalance() returns the value of balance as a double.
 * 
 * The setter methods (setAccountNumber() and setBalance()) are also public methods 
 * that modify private variables. 
 * Private variables are created by accepting parameters (String accountNumber 
 * and double balance). 
 * In this case, setAccountNumber() sets accountNumber value based on the provided 
 * argument. 
 * SetBalance() sets the balance value based on the provided argument.
 * 
 */

// JavaEncapsulation1.java
// Main class
public class JavaEncapsulation1 {
    public static void main(String[] args) {
        
    }
}
