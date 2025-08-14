/**
 * Write a Java program to create a vehicle class hierarchy. 
 * The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. 
 * Each subclass should have properties such as make, model, year, and fuel type. 
 * Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
 */

// Vehicle.java
// Parent class Vehicle
// Declare the abstract class Vehicle
/* public */ class Vehicle {
    // Private instance variable for the make of the vehicle
    private String make;

    // Private instance variable for the model of the vehicle
    private String model;

    // Private instance variable for the year of the vehicle
    private int year;

    // Private instance variable for the fuel type of the vehicle
    private String fuelType;

    // Private instance variable for the fuel efficiency of the vehicle
    private double fuelEfficiency;

    // Create a parameterized constructor
    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        // Initialize the make instance variable
        this.make = make;
        // Initialize the model instance variable
        this.model = model;
        // Initialize the year instance variable
        this.year = year;
        // Initialize the fuelType instance variable
        this.fuelType = fuelType;
        // Initialize the fuelEfficiency instance variable
        this.fuelEfficiency = fuelEfficiency;
    }

    // Add public method get make of the vehicle
    public String getMake() {
        return make;
    }

    // Add public method get model of the vehicle
    public String getModel() {
        return model;
    }

    // Add public method get year of the vehicle
    public int getYear() {
        return year;
    }

    // Add public method get fuel type of the vehicle
    public String getFuelType() {
        return fuelType;
    }

    // Add public method get fuel efficiency of the vehicle
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    // Abstract method to calculate the uel efficiency
    public abstract double calculateFuelEfficiency();

    // Abstract method to calculate the distance traveld
    public abstract double calculateDistanceTraveld();

    // Abstract method to get the maximum speed
    public abstract double getMaxSpeed();
}


public class JavaInheritance8 {
    
}
