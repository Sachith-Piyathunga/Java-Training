/**
 * Write a Java program to create a class called "Inventory" with a collection of 
 * products and methods to add and remove products, and to check for low inventory.
 */


// Product.java
// Define the product class
/* public */ class Product {

    // Create the private field
    private String name;
    // Create the private field
    private int quantity;

    // Constructor for the product class
    public Product(String name, int quantity) {
        // Assign the name parameter
        this.name = name;
        // Assign the quantity parameter
        this.quantity = quantity;
    }

    // Getter method for the name
    public String getName() {
        // Return the name
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        // Assign the name parameter
        this.name = name;
    }

    // Getter method for the quantity 
    public int getQuantity() {
        // Return the quantity
        return quantity;
    }

    // Setter method for the quntity
    public void setQuntity(int quntity) {
        // Assign the quantity parameter
        this.quantity = quntity;
    }
}














public class OOP11 {
    
}
