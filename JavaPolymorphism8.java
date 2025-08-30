/**
 * Write a Java program to create a base class Vehicle with methods startEngine() and 
 * stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() 
 * and stopEngine() methods in each subclass to start and stop the engines differently.
 */


// Vehicle.java
// Define the abstract vehicle class
abstract class Vehicle {
    // Abstract method to start the engine
    public abstract void startEngine();

    // Abstract method to stop the engine
    public abstract void stopEngine();
} 


// Car.java
// Define the car class
class Car extends Vehicle {
    // Override the start engine method
    @Override
    public void startEngine() {
        // Print the message
        System.out.println("Car engine started with a key.");
    }

    // Override the stop engine method
    @Override
    public void stopEngine() {
        // Print the message
        System.out.println("Car engine stopped when the key was turned off.");
    }
}


// Motorcycle.java
// Define the Motorcycle class
class Motorcycle extends Vehicle {
    // Override the start engine method
    public void startEngine() {
        // Print th mesage
        System.out.println("Motorcycle engine started with a kick-start.");
    }

    // Override the stop engine method
    public void stopEngine() {
        // Print the message
        System.out.println("Motorcycle engine stopped when ignition was turned off.");
    }
}


// JavaPolymorphism8.java
// Main class
public class JavaPolymorphism8 {
    // Defienthe main method
    public static void main(String[] args) {
        
    }
}
