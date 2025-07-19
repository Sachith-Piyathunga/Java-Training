/**
 * Static Method with Static Variable
 * 
 * Write a Java program to create a class called "IDGenerator" with a static 
 * variable 'nextID' and a static method "generateID()" that returns the next ID 
 * and increments 'nextID'. Demonstrate the usage of generateID in the main method.
 * 
 */

// Define the IDGenerator class
public class IDGenerator {
    // Declare a static variable nextID
    private static int nextID = 1;

    // Define a static method generateID to return the next ID and increment nextID
    public static int generateID() {
        return nextID++;
    }

    // Main method to demonstrate the usage of generateID
    public static void main(String[] args) {
        // Generate and print IDs
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
    }
}

/**
 * Explanation:
 * Define the IDGenerator class:
 *      The IDGenerator class is defined using the class keyword.
 * Declare a static variable nextID:
 *      The static variable nextID is declared and initialized to 1. This variable will keep track of the next ID to be generated.
 * Define a static method generateID:
 *      The static method generateID is defined to return the current value of nextID and then increment nextID.
 *      The method uses the ++ operator to increment the value of nextID after returning its current value.
 *  Main method to demonstrate the usage of generateID:
 *      The main method is defined to test the IDGenerator class.
 *      It calls the generateID method multiple times and prints the generated IDs to the console.
 * 
 */