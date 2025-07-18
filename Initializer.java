/**
 * Static Block
 * 
 * Write a Java program to create a class called "Initializer" with a static 
 * block that initializes a static variable 'initialValue' to 1000. Print the 
 * value of 'initialValue' before and after creating an instance of "Initializer".
 * 
 */

// Define the Initializer class
public class Initializer {
    // Declare a static variable initialValue
    static int initialValue;

    // Static block to initialize initialValue
    static {
        initialValue = 1000;
        System.out.println("Static block: initialValue initialized to " + initialValue);
    }

    // Main method to demonstrate the static block
    public static void main(String[] args) {
        // Print initialValue before creating an instance
        System.out.println("Before creating an instance: initialValue = " + Initializer.initialValue);

        // Create an instance of Initializer
        Initializer initializer = new Initializer();

        // Print initialValue after creating an instance
        System.out.println("After creating an instance: initialValue = " + Initializer.initialValue);
    }
}

/**
 * Explanation:
 * 
 * Define the Initializer class:
 *      The Initializer class is defined using the class keyword.
 * Declare a static variable initialValue:
 *      The static variable initialValue is declared.
 * Static block to initialize initialValue:
 *      A static block is used to initialize initialValue to 1000.
 *      A message is printed within the static block to indicate the initialization of initialValue.
 * Main method to demonstrate the static block:
 *      The main method is defined to test the Initializer class.
 *      The value of initialValue is printed before creating an instance of the Initializer class.
 *      An instance of the Initializer class is created.
 *      The value of initialValue is printed after creating an instance of the 
 *      Initializer class.
 * 
 */