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
    public BankAccount(String accountNumber, double balance) {
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
    public SavingsAccount(String accountNumber, double balance) {
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
        // Print the message
        System.out.println("Create a Bank Account object (A/c No. BAC426128) with initial balance of $500:");
        // Create the bankaccount object
        BankAccount BAC426128 = new BankAccount("BAC426128", 500);
        
        // Print message to indicate the deposit
        System.out.println("Deposit $1000 into account BAC426128");
        // Deposit the $1000 to accout
        BAC426128.deposit(1000);
        // Print the new balance after deposit
        System.out.println("New balance after depositing $1000: $" + BAC426128.getBalance());

        // Print message to indiocate the withdrawal action
        System.out.println("Withdraw the $600 from account BAC4256128: ");
        // Withdraw $600 from accountBAC426128
        BAC426128.withdraw(600);
        // Print the new balance after withdrawal
        System.out.println("New balanca after withdrawing $600: $" + BAC426128.getBalance());

        // Print message indicate the savingaccount
        System.out.println("\nCreate the SavingsAccount object (A/C No. SA454565) with initial balance of $450:");
        // Create the savingsaccount object
        SavingsAccount SA454565 = new SavingsAccount("SA454565", 450);

        // Withdraw the $300 from SA454565
        SA454565.withdraw(300);
        // Print the balance after withdrawing thw $300
        System.out.println("Balance after withdraw $300: $" + SA454565.getBalance());

        // Print message for another savingsaccout
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA787898) with initial balance of $300:");
        // Create the savings acount object
        SavingsAccount SA787898 = new SavingsAccount("SA787898", 300);

        // Print message to indicate the withdrawal action
        System.out.println("Try to withdraw thwe $250 from SA787898!");
        // Withdraw the $250 from SA787898
        SA787898.withdraw(250);
        // Print balance after withdraw
        System.out.println("Balance after trying to withdraw $250: $" + SA787898.getBalance());

    }
}

/**
 * Explanation
 * 
 * The BankAccount class has a constructor that takes account number and balance as arguments. 
 * It also has methods to deposit and withdraw money, and to check the account balance.
 * 
 * The SavingsAccount class is a subclass of BankAccount and overrides the withdraw() method. 
 * It checks if the account balance falls below one hundred before allowing a withdrawal. 
 * The method prints an error message if the balance is below one hundred. 
 * If the balance is greater than or equal to one hundred, the method calls the withdraw() method of the superclass to withdraw.
 * 
 * The main method begins by creating an instance of the BankAccount class with an account number 
 * of "BAC426128" and an initial balance of $500. 
 * It then deposits $1000 into the account and displays the new balance. 
 * It then withdraws $600 from the account and displays the new balance.
 * 
 * 
 * 
 */
