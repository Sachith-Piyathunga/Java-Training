/*
 * Write a Java recursive method to calculate the factorial of a given positive integer
 */

// RCSVMTD1.java
// Main class
public class RCSVMTD1 {

    // Define the satatic method
    public static int calculateFactorial(int n) {
        // Add the base case
        if (n == 0) {
            return 1;
        }

        // Add the recursive case
        return n * calculateFactorial(n - 1);
    }

    // Define the main method
    public static void main(String[] args) {
        int number = 7;
        int factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
        number = 12;
        factorial = calculateFactorial(number);

        System.out.println("\nFactorial of " + number + " is: " + factorial);
    }
}


/**
 * Explanation
 * 
 * First, I define a class "FactorialCalculator" that includes a recursive method 
 * calculateFactorial() to calculate the factorial of a given positive integer n.
 * The calculateFactorial() method follows the recursive factorial definition. It has two cases:
 *      - Base case: If n is 0, it returns 1. This is the termination condition for 
 *        recursion.
 *      - Recursive case: For any positive n, it multiplies n with the factorial of 
 *        n-1. This step is repeated recursively until n reaches 0.
 * In the main() method, we demonstrate the calculateFactorial() method by calculating the factorial of 7 and 12.
 */