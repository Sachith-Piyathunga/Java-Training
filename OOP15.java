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
            // Remove the rating
            this.ratings.remove(index);
        }
    }

    // Method add a rating to an item
    public void addRating() {
        // Get the index of the item
        int index = this.menuItems.indexOf(item);
        // Check the if item exsists in the menu
        if (index >= 0) {
            // Get the current rating
            int currentRating = this.ratings.get(index);
            // Get the current item count
            int totalCount = this.itemCounts.get(index);
            // Update the rarint of an item
            this.ratings.set(index, currentRating + ratings);
            // Update the item count
            this.itemCounts.set(index, itemCounts + 1);
        }
    }

    // Method to get the average rating of an item
    public double getAverageRating(String item) {
        // Get the index of the item
        int index = this.menuItems.indexOf(item);
        // Check if the item is exsists
        if (index >= 0) {
            // Get the total rating of an item
            int totalRating = this.ratings.get(index);
            // Get the item count 
            int itemCount = this.itemCounts.get(index);
            // Calculate and return the average rating
            return itemCount > 0 ? (double) totalRating / itemCount : 0.0;
        } else {
            // Return rating
            return 0.0;
        }
    }

    // Method to display the menu
    public void displayMenu() {
        // Loop through the menu items
        for (int i = 0; i < menuItems.size(); i++) {
            // Print the item
            System.out.println(menuItems.get(i) + ": $" + prices.get(i));
        }
    }

    // Method to calculate the average rating
    public double calculateAverageRating() {
        // Initialize total rating
        double totalRating = 0;
        // Initialize number of rating
        int numRatings = 0;
        // Loop through the rating
        for (int i = 0; i <ratings.size(); i++) {
            // Add the rating to total rating
            totalRating += ratings.get(i);
            // increment numebr of rating
            numRatings++;
        }
        // Calculate and return the average rating
        return numRatings > 0 ? totalRating / numRatings : 0.0;
    }
}


/**
 * Explanation
 * 
 * The above Java class defines a restaurant with menu items, prices, and ratings. 
 * It has a constructor that initializes three ArrayLists for the menu items, prices, 
 * and ratings. It also has methods to add and remove items from the menu and add 
 * ratings for each item. The class also includes a method to calculate the average 
 * rating for a given menu item. It also includes a method to display the current menu.
 * 
 */


// OOP15.java
// Main class 
public class OOP15 {
    // Define the main method
    public static void main(String[] args) {
        
    }
}
