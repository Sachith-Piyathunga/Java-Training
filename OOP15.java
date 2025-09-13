/**
 * Write a Java program to create a class called "Restaurant" with attributes for menu 
 * items, prices, and ratings, and methods to add and remove items, and to calculate 
 * average rating.
 */


// Import the java ArrayList class
import java.util.ArrayList;

// Restaurant.java
// Defeine the Restaurant class
/* public */ class Restaurant {

    // Declare the ArrayList
    private ArrayList menuItems;
    private ArrayList prices;
    private ArrayList ratings;
    private ArrayList itemCounts;
    
    // Constructor for the Restaurant class
    public Restaurant() {
        // Initialize the parameters in arraylist
        this.menuItems = new ArrayList();
        this.prices = new ArrayList();
        this.ratings = new ArrayList();
        this.itemCounts = new ArrayList();
    }

    // Mehtod to add an items to the menu
    public void addItem(String item, double price) {
        // Add the item to the menu items list
        this.menuItems.add(item);
        // Add price to the prices list
        this.prices.add(price);
        // Initialize the rating for the item
        this.ratings.add(0);
        // Initialize the item count
        this.itemCounts.add(0);
    }

    // Method to remove an item from the menu
    public void removeItem(String item) {
        // Get the index of the item in the menu items list
        int index = this.menuItems.indexOf(item);
        // Check if the item exsists in the menu
        if (index >= 0) {
            // Remove item
            this.menuItems.remove(index);
            // Remove the price
            this.prices.remove(index);
            
        }
    }
}
























public class OOP15 {
    
}
