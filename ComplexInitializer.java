/**
 * Static Block for Complex Initialization
 * 
 * Write a Java program to create a class called "ComplexInitializer" with a static 
 * block that initializes multiple static variables (x, y, z) using complex logic. 
 * Print the values of these variables in the main method.
 * 
 */

// Define the ComplexInitializer class
public class ComplexInitializer {
    // Declare static variables x, y, z
    private static int x;
    private static int y;
    private static int z;

    // Static block to initialize the static variables using complex logic
    static {
        x = 10;
        y = 20;
        z = calculateZ(x, y);
    }

    // Static method to calculate the value of z
    private static int calculateZ(int a, int b) {
        return a * b + (a - b);
    }

    // Main method to print the values of the static variables
    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}

/**
 * Explanation:
 * 
 * Define the ComplexInitializer class:
 *      The ComplexInitializer class is defined using the class keyword.
 * Declare static variables x, y, z:
 *      The static variables x, y, and z are declared within the class.
 * Static block to initialize the static variables using complex logic:
 *      The static block is used to initialize the static variables. It sets x to 10, y to 20, and calculates z using the calculateZ method.
 *      The static block runs once when the class is first loaded, ensuring that the static variables are initialized before they are used.
 * Static method to calculate the value of z:
 *      The calculateZ method is a static method that takes two integers as parameters and returns the result of a complex calculation involving multiplication and subtraction.
 *      This method is used within the static block to initialize the value of z.
 * Main method to print the values of the static variables:
 *      The main method is defined to test the ComplexInitializer class.
 *      It prints the values of x, y, and z to the console.
 * 
 */

