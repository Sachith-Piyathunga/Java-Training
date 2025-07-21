/**
 * Check if Double is Integer
 * 
 * Write a Java program to test if a double number is an integer.
 */

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        double num = 5.4444;
        if ((num % 1) == 0) {
            System.out.println("It is not a double number");
        } else {
            System.out.println("It is a double number");
        }
    }
}