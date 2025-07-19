/**
 * Static Members in Different Contexts
 * 
 * Write a Java program to create a class called "BankAccount" with instance 
 * variables 'accountNumber' and balance, and static variables 'bankName' and 
 * 'interestRate'. Provide static methods to get and set the static variables. 
 * Create several 'BankAccount' objects and print their details along with the 
 * static variables.
 * 
 */

 public class BankAccount  {
    private String accountNumber;
    private double balance;

    private static String bankName;
    private static double interestRate;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static double getInterestRate() {
        return interestRate;
    }
 }