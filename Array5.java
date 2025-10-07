// Write a Java program to test if an array contains a specific value


// Define the Array5 class
public class Array5 {

    // Define the method
    public static boolean contains(int[] arr, int item) {
        // Iterate through the each eliment
        for (int n : arr) {
            // Add the condition
            if (item == n) {
                // If a match is found
                return true;
            }
        }
        // If no match is found, return 'false'
        return false;
    }

    // Define the main method
    public static void main(String[] args) {
        // Declare the integer array
        int[] myArray = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456
        };

        // Check if the integer array 'my_array1' contains the item 2013
        System.out.println(contains(myArray, 2013));

        // Check if the integer array 'my_array1' contains the item 2015
        System.out.println(contains(myArray, 2015));
    }
}



/**
 * 
 * Class and Method Setup

public class Array5 {

Declares a class named Array5.

public static boolean contains(int[] arr, int item) {

Defines a static method called contains that:

Accepts an integer array arr and an integer item to search for.

Returns true if the item is found, otherwise returns false.
 */