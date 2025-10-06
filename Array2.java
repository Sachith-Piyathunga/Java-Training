// Write a Java program to sum values of an array

// Define the Array2 class
public class Array2 {
    // Define the main method
    public static void main(String[] args) {
        // Declare the integer array
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declare the variable
        int sum = 0;

        // Create the for loop
        for (int i : myArray)
            // Add each element to the sum
            sum += i;
        // Print the sum of array
        System.out.println("The sum is " + sum);
    }
}
