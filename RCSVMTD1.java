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
    }
}
