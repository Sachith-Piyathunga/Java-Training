/**
 * Write a Java program to create a class called "ElectronicsProduct" with 
 * attributes for product ID, name, and price. Implement methods to apply a 
 * discount and calculate the final price. Create a subclass " WashingMachine" 
 * that adds a warranty period attribute and a method to extend the warranty.
 * 
 */


 // ElectronicsProduct.java
// Define the ElectronicsProduct class
/* public */ class ElectronicsProduct {

    // Create the atributes
    private String productID;
    private String name;
    private double price;

    // Constructor for the ElectronicsProduct class
    public ElectronicsProduct(String productID, String name, double price) {
        // Assign the parameters
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Method to apply the discount
    public void applyDiscount(double discountPercentage) {
        // Calculate the discount amount
        double discountAmount = price * discountPercentage / 100;
        // Substract the discount amount
        price -= discountAmount;
    }

    // Method to calculate the final price
    public double getFinalPrice() {
        // Return the price
        return price;
    }

    // Getter method for the product ID
    public String getProductId() {
        // Return the product ID
        return productID;
    }

    // Getter method for the name
    public String getName() {
        // Return the name
        return name;
    }

    // Getter method for the price
    public double getPrice() {
        // Return the price
        return price;
    }
}


/**
 * Explanation
 * 
 * ElectronicsProduct Class:
 *      - Attributes: productId, name, and price.
 *      - Constructor: Initializes the attributes.
 *      - applyDiscount(double discountPercentage): Applies a discount to the product price.
 *      - getFinalPrice(): Returns the final price after the discount.
 *      - Getters: Methods to get the values of the attributes.
 * 
 */


// WashingMachine.java
// Define the WashingMachine subclass
class WashingMachine extends ElectronicsProduct {

    // Create the atribute
    private int warrantyPeriod;

    // Constructor for the WashingMachine subclass
    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        // Call the superclass constructor
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Method to extends the warranty period
    public void extendWarranty(int additionalMonths) {
        // Add the addtional months
        warrantyPeriod += additionalMonths;
    }

    // Getter method for the warranty period
    public int getWarrantyPeriod() {
        // Return the warranty period
        return warrantyPeriod;
    }

    // Override the display method
    @Override
    public void applyDiscount(double discountPercentage) {
        // Call the super class method
        super.applyDiscount(discountPercentage);
        // Display a message
        System.out.println("Discount applied to Washing Machine: " + getName());
    }
}


/**
 * Explanation
 * 
 * WashingMachine Class:
 *      - Extends ElectronicsProduct.
 *      - Additional Attribute: warrantyPeriod.
 *      - Constructor: Initializes the attributes, calling 
 *        the superclass constructor for the common attributes.
 *      - extendWarranty(int additionalMonths): Extends the warranty period by the given
 * 
 */


// OOP21.java
// Main class
public class OOP21 {
    // Define the main method
    public static void main(String[] args) {

        // Create an ElectronicsProduct object
        ElectronicsProduct product = new ElectronicsProduct("WM123", "Washing Machine", 1.00);
        // Apply the discount
        product.applyDiscount(10);
        // Display the final price with details
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
    }
}
