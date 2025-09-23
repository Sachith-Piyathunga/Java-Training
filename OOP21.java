/**
 * Write a Java program to create a class called "ElectronicsProduct" with 
 * attributes for product ID, name, and price. Implement methods to apply a 
 * discount and calculate the final price. Create a subclass " WashingMachine" 
 * that adds a warranty period attribute and a method to extend the warranty.
 * 
 */


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






































public class OOP21 {
    
}
