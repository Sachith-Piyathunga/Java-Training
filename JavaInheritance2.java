/**
 * Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that 
 * overrides the drive() method to print "Repairing a car".
 * This program creates a class called 'Vehicle' with a method called drive() and a subclass called Car that overrides 
 * the drive() method to print "Repairing a car".
 */

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

// Define the child class Car that extends Vehicle
class Car extends Vehicle {
    // Use the @Override annotation to indicate that this method overrides a method in the superclass
    @Override
    // Define the drive method
    public void drive() {
        // Print "Repairing a car" to the console
        System.out.println("Repairing a car");
    }
} 
/**
 * The above code defines a Java class named Car, which is a child class that 
 * extends the parent class Vehicle. Inside this class:
 * 
 * There is a method named drive(), which overrides the drive() method from the 
 * parent class Vehicle. The overridden method prints "Repairing a car" to the console.
 */

 // Define the main class
public class JavaInheritance2 {
    // Define the main method
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        // Create an instance of Car
        Car car = new Car();
        // Call the drive method on the vehicle instance
        vehicle.drive(); // Output: Repairing a vehicle
        // Call the drive method on the car instance
        car.drive(); // Output: Repairing a car
    }
}

/**
 * An instance of the Vehicle class is created and stored in the variable vehicle.
 * An instance of the Car class is created and stored in the variable car.
 * The drive() method is called on the vehicle object, resulting in the output "Repairing a vehicle."
 * The drive() method is called on the car object, resulting in the output "Repairing a car."
 */

