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

/**
 * Explanation
 * 
 * This is an abstract class that serves as the parent class for the other vehicle classes. 
 * It contains five private instance variables (make, model, year, fuelType, and fuelEfficiency) 
 * and six public methods (a constructor, five getters for the instance variables, and three abstract methods). 
 * The abstract methods are meant to be overridden by child classes with specific implementations.
 * 
 */

// Truck.java
// Child class Truck
// Declare the Truck class which extends the Vehicle class
/* public */ class Truck extends Vehicles {
    // Private instance variable
    private double cargoCapacity;
    // Parameterized constructor
    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
        // Call the costructer of the superclass
        super(make, model, year, fuelType, fuelEfficiency);
        // Initializa the cargoCapacity instance variable
        this.cargoCapacity = cargoCapacity;
    }

    // Public method to get the cargo capacity of the truck
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    // Override the calculate the fuel efficiency method from the supper class
    @Override
    public double calculateFuelEfficiency() {
        // Implementtion for fuel efficiency
        return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    // Override the calculateDistanceTraveled method from super class
    @Override
    public double calculateDistanceTraveled() {
        // Implimantation for distance traveld calculation
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    // Override the getMaxSpeed method from the supper class
    @Override 
    public double getMaxSpeed() {
        // Implimantation for max speed
        return 80.0;
    }
}

/**
 * Explanation
 * 
 * The above class is a child class of Vehicle and extends the Vehicle class. 
 * It has an additional instance variable, cargoCapacity. 
 * The class has a constructor that accepts all the necessary parameters including cargo capacity. 
 * The class overrides the three abstract methods of the parent class and provides specific implementations of the methods.
 * 
 */

// Car.java
// Child class Car
// Declare the Car class extends the Vehicle class
/* public */ class Car extends Vehicle {

    // Private instance variable
    private int numSeats;

    // Constructor for the Car class
    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        // Call the costructor from the super clas
        super(make, model, year, fuelType, fuelEfficiency);
        // Initiaalize the instance variable
        this.numSeats = numSeats;
    }

    // public method to get the number of seats in the car
    public int getNumSeats() {
        return numSeats;
    }

    // Override the calculateFuelEfficiency method
    @Override
    public double calculateFuelEfficiency() {
        // Implimantation for fuel efficiency calculation for the cars
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    //Override the calculateDistanceTraveled method
    @Override
    public double calculateDistanceTraveled() {
        // Implimantation for distance traveled calculation for cars
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    // Override the getMaxSpeed method
    @Override
    public double getMaxSpeed() {
        // Implimantation for maximum speed calculation for the cars
        return 120.0;
    }
}

/**
 * Explanation
 * 
 * The above class is another child class of Vehicle and extends the Vehicle class. 
 * It has an additional instance variable, numSeats. The class has a constructor 
 * that accepts all the necessary parameters including the number of seats. 
 * The class overrides the three abstract methods of the parent class and provides 
 * specific implementations of the methods.
 * 
 */

// Motorcycle.java
// Child class Motorcycle
// Declare the Motocycle class with extends the Vehi
/* public */ class Motorcycle extends Vehicle {
    // Private instance variable for the engine displacement of the moyorcycle
    private double engineDisplacement;

    // Constructor to motorcycle class
    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        
    }

}




public class JavaInheritance8 {
    
}
