/**
 * Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that 
 * overrides the drive() method to print "Repairing a car".
 * This program creates a class called 'Vehicle' with a method called drive() and a subclass called Car that overrides 
 * the drive() method to print "Repairing a car".
 */

public class JavaInheritance2 {
    
}

// Define the parent class Vehicle
class Vehicle {
    // Define a public method named drive
    public void drive() {
        // Print "Repairing a vehicle" to the console
        System.out.println("Repairing a vehicle");
    }
} 
// The above code defines a Java class named Vehicle. Inside this class:
// There is a method called drive(), which prints "Repairing a vehicle" to the console.

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing the Car");
    }
}