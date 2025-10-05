/**
 * Write a Java program to sort a numeric array and a string array.
 */


// Import the java Array class
import java.util.Arrays;

// Define a class called Array1
public class Array1 {
    // Define th main method
    public static void main(String[] args) {

        // Initialize the integer array
        int[] myArray1 = {
           1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456 
        };

        // Initialize a string array
        String[] myArray2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };

        // Print the original numeric array
        System.out.println("Original numeric array : " + Arrays.toString(myArray1));
        
        // Sort the numeric array in ascending order
        Arrays.sort(myArray1);

        // Print the sorted numeric array
        System.out.println("Sorted numeric array : " + Arrays.toString(myArray1));
        
        // Print the original string array
        System.out.println("Original string array : " + Arrays.toString(myArray2));
        



    }
}
