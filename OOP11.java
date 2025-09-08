/**
 * Write a Java program to create a class called "Inventory" with a collection of 
 * products and methods to add and remove products, and to check for low inventory.
 */


// Import the ArrayList class
import java.util.ArrayList;


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


/**
 * 
 * Explanation
 * 
 * In the above code, we create a class called "Product" with two private attributes, 
 * "name" and "quantity". We also create a constructor to initialize these attributes 
 * and getter and setter methods to access and modify them.
 * 
 */


// Inventory.java
// Define the inventory class
/* public */ class Inventory {

    // Create the private field to store the product list
    private ArrayList<Product> products;

    // Constructor for the initialize the product field
    public Inventory() {
        // Create the new array list
        products = new ArrayList<Product>();
    }

    // Method to add the product into product list
    public void addProduct(Product product) {
        // Add the product into product list
        products.add(product);
    }

    // Method to remove the product from product list
    public void removeProduct(Product product) {
        // Remove product from the list
        products.remove(product);
    }

    // Method to check the low inventory products
    public void checkLowInventory() {
        // Iterate through the list of products
        for (Product product : products) {
            // Check if the product quantity is less than or equal to 100
            if (product.getQuantity() <= 100) {
                // Print the message
                System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
            }
        }
    }
}


/**
 * 
 * Explanation
 * 
 * Here we create a class called "Inventory" with a private attribute "products", 
 * which is an ArrayList of Product objects. We also create a constructor to 
 * initialize this attribute as an empty list and methods to add and remove 
 * products from the list. Additionally, we create a method called 
 * "checkLowInventory()" to check for low inventory levels in the products list.
 * 
 */


// OOP11.java
// Main class
public class OOP11 {
    // Define the main method 
    public static void main(String[] args) {

    }
}
