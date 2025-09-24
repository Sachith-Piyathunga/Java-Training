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

    // Method to calculate total rent
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    // Override the displayInfo method
    @Override
    public void displayInfo() {
        // Print the information
        super.displayInfo();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: $" + rentPerApartment);
        System.out.println("Total Resnt: $" + calculateTotalRent());
    }
}


/**
 * Explanation
 * 
 * The above Java code defines a "ResidentialBuilding class" that extends the Building 
 * class. It adds two additional attributes: numberOfApartments and rentPerApartment. 
 * The constructor initializes these attributes along with those inherited from 
 * Building. The method calculateTotalRent() computes the total rent based on the 
 * number of apartments and the rent per apartment. The displayInfo() method is 
 * overridden to include details specific to residential buildings, in addition 
 * to the information from the "Building class".
 * 
 */


// CommercialBuilding.java
// Defiene the CommercialBuilding subclass
class CommercialBuilding extends Building {

    // Create the attributes
    double officeSpace;
    double rentPerSquareMeter;

    // Constructor for the CommercialBuilding subclass
    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpace, double rentPerSquareMeter) {
        // Call the super class constructor
        super(address, numberOfFloors, totalArea);
        // Assign the parameters
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    // Method to calculate total rent
    public double calculateTotalRent() {
        return officeSpace * rentPerSquareMeter;
    }

    // Override the display info method
    @Override
    public void displayInfo() {
        // Display infomations
        super.displayInfo();
        System.out.println("Office Space: " + officeSpace + " sq meters");
        System.out.println("Rent per Square Meter: $" + rentPerSquareMeter);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}


/**
 * Explanation
 * 
 * The above Java code defines a "CommercialBuilding class" that extends the Building 
 * class. It adds two additional attributes: officeSpace (in square meters) and 
 * rentPerSquareMeter. The constructor initializes these attributes along with 
 * those inherited from Building. The method calculateTotalRent() computes the total 
 * rent based on the office space and rent per square meter. The displayInfo() 
 * method is overridden to include details specific to commercial buildings, in 
 * addition to the information from the Building class.
 * 
 */


// OOP22.java
// Main class
public class OOP22 {
    // Define the main method
    public static void main(String[] args) {
        
    }
}
