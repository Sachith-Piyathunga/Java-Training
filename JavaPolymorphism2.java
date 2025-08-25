/**
 * Write a Java program to create a class Vehicle with a method called speedUp(). 
 * Create two subclasses Car and Bicycle. Override the speedUp() method in each 
 * subclass to increase the vehicle's speed differently.
 */

// Vehicle.java
// Base class Vehicle
// Declare the Vehicle class
class Vehicle {
    // Private field for the speed
    private int speed;

    // Method to increece the speed
    public void speedUp() {
        speed += 10;
    }

    // Method to get the current speed
    public int getSpeed() {
        return speed;
    }
}



public class JavaPolymorphism2 {
    
}
