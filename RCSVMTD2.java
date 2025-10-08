/**
 * Write a Java recursive method to calculate the sum of all numbers from 1 to n.
 */

// RCSVMTD2.java
// Main class
public class RCSVMTD2 {
    
    // Define the static method
    public static int calculateSum(int n) {
        // Add the base case
        if (n == 0) {
            return 0;
        }
        // Add the recursive case
        return n + calculateSum(n - 1);
    }

    // Define the main method
    public static void main(String[] args) {
        int number = 7;
        int sum = calculateSum(number);

        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
    }
}


/**
 * Explanation
 * 
 * The calculateSum() method follows the recursive definition of the sum. It has 
 * two cases:
 *      - Base case: If the input n is 0, it returns 0. This is the termination 
 *        condition for recursion.
 *      - Recursive case: For any positive n, it adds n with the sum of the 
 *        numbers from 1 to n-1. This step is repeated recursively until n reaches 0
 * In the main() method, we demonstrate the calculateSum() method by calculating the 
 * sum of numbers from 1 to 7 and printing the result.
 * 
 */