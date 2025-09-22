/**
 * Write a Java program to create a class called "Customer" with attributes for name, 
 * email, and purchase history. Implement methods to add purchases to the history 
 * and calculate total expenditure. Create a subclass "LoyalCustomer" that adds a 
 * discount rate attribute and a method to apply the discount.
 * 
 */

// Import necessary classes
import java.util.ArrayList;
import java.util.List;

// Define the Customer class
/* public */ class Customer {
    // Cerate the atributes
    private String name;
    private String email;
    private List<Double> purchaseHistory;

    // Constructor for the customer class
    public Customer(String name, String email) {
        // Inititalize the parameters
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    // Method to add the purchase
    public void addPurchase(double amount) {
        purchaseHistory.add(amount);
    }

    // Method to calculate the total expenditure
    public double calculateTotalExpenditure() {
        double total = 0;
        // Loop through the each purchase
        for (double purchase : purchaseHistory) {
            total += purchase;
        } 
        return total;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Getter method for the email
    public String getEmail() {
        return email;
    }

    // Getter method for the purchase history
    public List<Double> getPurchaseHistory() {
        return purchaseHistory;
    }
}


/**
 * Explanation
 * 
 * Customer Class:
 *      - The Customer class has attributes for customer name, email, and purchase history.
 *      - The constructor initializes with the name, email, and an empty purchase history.
 *      - "addPurchase()" method adds a purchase amount to the purchase history.
 *      - "calculateTotalExpenditure()" method calculates the total amount 
 *        spent by summing up the purchase history.
 *      - Getters provide access to the customer's name, email, and purchase history.
 * 
 */


// Define the LoyalCustomer subclass
class LoyalCustomer extends Customer {

    // Define the atribute
    private double discountRate;

    // Create the constructor
    public LoyalCustomer(String name, String email, double discountRate) {
        // Call the super class constructor
        super(name, email);
        this.discountRate = discountRate;
    }

    // Method to apply the discount
    public double applyDiscount(double amount) {
        return amount - (amount * discountRate / 100);
    }

    // Override the add purchase method
    @Override
    public void addPurchase(double amount) {
        double discountAmount = applyDiscount(amount);
        // Call the superclass method
        super.addPurchase(discountAmount);
    }

    // Getter method for the discount rate
    public double getDiscountRate() {
        return discountRate;
    }

    // Setter method for the discount rate
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}


/**
 * Explanation
 * 
 * LoyalCustomer Subclass:
 *      - The LoyalCustomer class extends the Customer class and adds a discountRate attribute.
 *      - The constructor initializes the LoyalCustomer with a discount rate, 
 *        in addition to the attributes inherited from Customer.
 *      - "applyDiscount()" method calculates the discounted amount.
 *      - "addPurchase()" method overrides the superclass method to 
 *        apply the discount before adding the purchase.
 *      - Getter and setter methods provide access to the discount rate.
 */


// OOP19.java
// Main class
public class OOP19 {
    // Defiene the main method
    public static void main(String[] args) {
        
    }
}
