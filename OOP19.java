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
 * 
 * 
 * 
 * 
 */



































public class OOP19 {
    
}
