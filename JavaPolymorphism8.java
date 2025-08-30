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
}





public class JavaPolymorphism8 {
    
}
