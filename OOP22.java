/**
 * Write a Java program to create a class called "Building" with attributes for 
 * address, number of floors, and total area. Create subclasses "ResidentialBuilding" 
 * and "CommercialBuilding" that add specific attributes like number of apartments 
 * for residential and office space for commercial buildings. Implement a method 
 * to calculate the total rent for each subclass.
 * 
 */


// Building.java
// Import the necessary packages
import java.util.ArrayList;
import java.util.List;

// Defien the Building class
class Building {
    
    // Create the attributes
    String address;
    int numberOfFloors;
    double totalArea;

    // Constructor for the Building class
    public Building(String address, int numberOfFloors, double totalArea) {
        // Assign the parameters
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    // Method to display basic information
    public void displayInfo() {
        // Print the information
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq meters");
    }
}


/**
 * Explanation
 * 
 * The above Java code defines a "Building class" with three attributes: address, 
 * numberOfFloors, and totalArea. It includes a constructor to initialize these 
 * attributes and a method displayInfo() to print the building's information. 
 * The import statements at the top are prepared for possible use of ArrayList 
 * and List classes, although they are not utilized in the provided code segment.
 * 
 */


// ResidentialBuilding.java
// Define the ResidentialBuilding subclass
class ResidentialBuilding extends Building {

    // Create the atributes
    int numberOfApartments;
    double rentPerApartment;

    // Constructor for the ResidentialBuilding subclass
    public ResidentialBuilding (String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        // Call the super class constructor
        super(address, numberOfFloors, totalArea);
        // Assign the parameters
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }
}


























public class OOP22 {
    
}
