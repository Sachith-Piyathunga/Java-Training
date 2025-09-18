/**
 * Write a Java program to create a class called "Vehicle" with attributes for make, 
 * model, and year. Create subclasses "Car" and "Truck" that add specific 
 * attributes like trunk size for cars and payload capacity for trucks. Implement 
 * a method to display vehicle details in each subclass.
 * 
 */


// Vehicle.java
// Define the Vehicle class
/* public */ class Vehicle {

    // Declare the variable
    private String make;
    // Declare the variable
    private String model;
    // Declare the variable
    private int year;

    // Constructor for the Vehicle class
    public Vehicle(String make, String model, int year) {
        // Initialize the make 
        this.make = make;
        // Initialize the model
        this.model = model;
        // Initialize the year
        this.year = year;
    }

    // Model to display Vehicle details
    public void displayDetails() {
        // Print the details
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
    }
}


















public class OOP18 {
    
}
