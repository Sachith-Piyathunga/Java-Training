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

// Car.java
// Subclass Car
// Declare the Car class that extends the Vehicle
class Car extends Vehicle {
    // Override the speedUp method from the vehicle class
    @Override
    public void speedUp() {
        // Call the speedUp method of the perant class
        super.speedUp();
        // Print the message 
        System.out.println("\nCar speed increased by 22 units.");
    }
}

// Motorcycle.java
// Subclass Motorcycle
// Declare the Motorcycle class that extends the vehicle class
class Motorcycle extends Vehicle {
    // Override the speedUp method from the vehicle class
    @Override
    public void speedUp() {
        // Call the speedUp method
        super.speedUp();
        // Print the message
        System.out.println("Motorcycle speed increased by 12 units");
    }
}

// JavaPolymorphism2.java
// Main class
// Declare the main class
public class JavaPolymorphism2 {
    // Main method 
    public static void main(String[] args) {
        // Create the instance of the Car class
        Car car = new Car();
        // Create the instance of the Motorcycle
        Motorcycle motorcycle = new Motorcycle();

        // Print the initial speed of the car
        System.out.println("Car initial speed: " + car.getSpeed());
        // Print the initial speed of the motorcycle
        System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());

        // Speed up the car
        car.speedUp();
        // Speed up the motorcycle
        motorcycle.speedUp();

        // Print the speed of the car after speeding up
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        // Print the speed of the motorcycle after speeding up
        System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
    }
}
