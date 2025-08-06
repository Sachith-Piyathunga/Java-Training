/**
 * Write a Java program to create a class known as "BankAccount" with methods called 
 * deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the 
 * withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 */

 // Declare the BankAccount class
class BankAccount {
    private String accountNumber;
    private double blance;

    public BankAccount(String accountNumber, double blance) {
        this.accountNumber = accountNumber;
        this.blance = blance;
    }
}

public class JavaInheritance4 {
    
}
