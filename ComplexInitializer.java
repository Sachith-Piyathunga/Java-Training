/**
 * Static Block for Complex Initialization
 * 
 * Write a Java program to create a class called "ComplexInitializer" with a static 
 * block that initializes multiple static variables (x, y, z) using complex logic. 
 * Print the values of these variables in the main method.
 * 
 */

 public class ComplexInitializer {
    
    private static int x;
    private static int y;
    private static int z;

    static {
        x = 10;
        y = 39;
        z = calculateZ(x, y);
    }
 }