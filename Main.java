/**
 * Extract First Digit of Integer
 * Write a Java method for extracting the first digit from a positive or negative integer. 
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = in.nextInt();
        System.out.println("Extract the first digit from the said integer: ");
        System.out.println(test(n));
    }

    public static int test(int n) {
        int fact_num = 10;
        while(n / fact_num!= 0) {
            fact_num *= 10;
        }
        return Math.abs(n / (fact_num/10));
    }
}