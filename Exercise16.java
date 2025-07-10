/**
 * Find Twin Primes Less Than 100
 * Write a Java method to find all twin prime numbers less than 100.
 */

import java.util.Scanner;

public class Exercise16  {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {

            if (is_Prime(i) && is_Prime(i + 2)) {
                System.out.println("(%d, %d)\n", i, i + 2);
            }
        }
    }
}