/**
 * Reverse an Integer
 * 
 * Write a Java program to reverse an integer number.
 */

public class Example6 {
    public static void main(String[] args) {
        int num = 1287;
        int positive = 1;
        
        if (num < 0) {
            positive = -1;
            num = -1 * num;
        }
    }
}