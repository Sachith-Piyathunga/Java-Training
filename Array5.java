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

        
    }
}
