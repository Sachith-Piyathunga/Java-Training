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
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Getter method for make
    public String getMake() {
        // Return the make
        return make;
    }

    // Getter method for model
    public String getModel() {
        // Return the model
        return model;
    }

    // Getter method for year
    public int getYear() {
        // Return the year
        return year;
    }
}


/**
 * Explanation
 * 
 * The above Java code defines a Vehicle class with attributes for the make, model, 
 * and year of the vehicle. It includes:
 * 
 *      - Attributes: Private fields for make, model, and year.
 *      - Constructor: A constructor that initializes these attributes.
 *      - Method to display details (displayDetails): Prints the vehicle's 
 *        make, model, and year.
 *      - Getter methods: getMake(), getModel(), and getYear() methods return the 
 *        values of the make, model, and year attributes, respectively.
 * 
 * This class provides a basic blueprint for a vehicle with methods to access and 
 * display its details.
 */


// Define the Car subclass
class Car extends Vehicle {

    // Attribute for trunck size for the car
    private double trunckSize;

    // Constructor for the car class
    public Car(String make, String model, int year, double trunckSize) {
        // Call the constructor of the super class
        super(make, model, year);
        this.trunckSize = trunckSize;
    }

    // Override the displaydetails method
    @Override
    public void displayDetails() {
        // Call the super class method
        super.displayDetails();
        System.out.println("Trunck size: " + trunckSize + " cubic feet.");
    }

    // Getter method for the trunck size
    public double getTrunckSize() {
        // Return the trunck size
        return trunckSize;
    }

    // Setter method for the trunck size
    public void setTrunckSize(double trunckSize) {
        if (trunckSize > 0) {
            this.trunckSize = trunckSize;
        } else {
            System.out.println("Trunck size must be possitive.");
        }
    }
}


/**
 * Explanation
 * 
 * This Java code defines a 'Car' subclass that extends the Vehicle class, adding an 
 * additional attribute and behavior specific to cars:
 * 
 *      - Attribute: trunkSize to store the size of the car's trunk in cubic feet.
 *      - Constructor: Initializes the 'Car' object with make, model, year, and trunk 
 *        size. It calls the constructor of the Vehicle superclass to initialize 
 *        the common attributes.
 *      - Method to display details (displayDetails): Overrides the displayDetails 
 *        method from the Vehicle class to include the trunk size. It first calls the 
 *        superclass method to display common vehicle details, then adds the trunk size.
 *      - Getter and Setter methods: getTrunkSize() returns the trunk size, and setTrunkSize() 
 *        updates the trunk size if the value is positive.
 * 
 * This subclass enhances the Vehicle class by adding a specific feature for cars and overriding 
 * the method to display complete car details.
 * 
 */


// Define the Truck subclass
class Truck extends Vehicle {

    // Attribute for the payload capacity
    private double payloadCapacity;

    // Constructor for the truck class
    public Truck(String make, String model, int year, double payloadCapacity) {
        // Call the constructor of the super class
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    // Override the display details method
    @Override
    public void displayDetails() {
        // Call the superclass method
        super.displayDetails();
        System.out.println("Payload capacity: " + payloadCapacity + " tons.");
    }

    // Getter method for payload capacity
    public double getPayloadCapacity() {
        // Return the payload capacity
        return payloadCapacity;
    }

    // Setter method for the payload capacity
    public void setPayloadCapacity(double payloadCapacity) {
        if (payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be positive.");
        }
    }
}


/**
 * Explanation
 * 
 * The above Java code defines a 'Truck' subclass that extends the Vehicle class, 
 * adding an attribute specific to trucks:
 * 
 *      - Attribute: payloadCapacity to store the truck's payload capacity in tons.
 * 
 *      - Constructor: Initializes the Truck object with make, model, year, and 
 *        payload capacity. It calls the constructor of the Vehicle superclass to 
 *        initialize the common attributes.
 *  
 *      - Method to display details (displayDetails): Overrides the displayDetails  
 *        method from the Vehicle class to include the payload capacity. It first 
 *        calls the superclass method to display common vehicle details, then adds 
 *        the payload capacity.
 */






















public class OOP18 {
    
}
