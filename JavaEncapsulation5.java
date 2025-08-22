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
        
    }
}



public class JavaEncapsulation5 {
    
}
