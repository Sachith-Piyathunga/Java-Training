/**
 * Write a Java program to create a class called Smartphone with private instance 
 * variables brand, model, and storageCapacity. Provide public getter and setter 
 * methods to access and modify these variables. Add a method called increaseStorage() 
 * that takes an integer value and increases the storageCapacity by that value.
 */

// Define the Smartphone class
/* public */ class Smartphone {
    // Private instance variables
    private String brand;
    private String model;
    private int storageCapacity;

    // Public getter method for the brand variable
    public String getBrand() {
        return brand;
    }

    // Setter method for the brand variable
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for model variable
    public String getModel() {
        return model;
    }

    // Setter method for model variable
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for storageCapacity variable
    public int getStorageCapacity() {
        return storageCapacity;
    }

    // Setter method for storageCapacity variable
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Method to increase the storage capacity by given value
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            this.storageCapacity += additionalStorage;
        }
    }
}

// JavaEncapsulation5.java
// Main class
public class JavaEncapsulation5 {
    // Main method to test the Samrtphone class
    public static void main(String[] args) {
        // Create the new object
        Smartphone phone = new Smartphone();

        // Set the values of the phone
        phone.setBrand("SAMSUNG");
        phone.setModel("Galaxy S25 Ultra");
        phone.setStorageCapacity(512);

        // Increase storage capacity by 512
        phone.setStorageCapacity(512);

        // Print the details of the phone
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage Capacity: " + phone.getStorageCapacity() + "GB");
    }
}


/**
 * Explanation
 * 
 * Private Instance Variables: The brand, model, and storageCapacity variables are 
 * declared as private to ensure encapsulation.
 * 
 * Public Getters and Setters: These methods provide controlled access to the private variables.
 *      getBrand(): Returns the brand.
 *      setBrand(String brand): Sets the brand.
 *      getModel(): Returns the model.
 *      setModel(String model): Sets the model.
 *      getStorageCapacity(): Returns the storage capacity.
 *      setStorageCapacity(int storageCapacity): Sets the storage capacity.
 * 
 * increaseStorage Method: Takes an integer value and increases the storageCapacity by 
 * that value if it's positive.
 * 
 * Main Method: Tests the functionality of the Smartphone class by creating an instance, 
 * setting its properties, increasing the storage, and printing the details.
 * 
 * Note on Encapsulation
 * Encapsulation works in the above exercise by:
 * 
 *      Hiding Data: The private instance variables brand, model, and storageCapacity 
 *      are not accessible directly from outside the class.
 * 
 *      Controlled Access: The public getter and setter methods provide controlled 
 *      access to the private variables, allowing for validation and modification when necessary.
 */