/**
 * Check Positive or Negative Number
 * Write a Java program to get a number from the user and print whether 
 * it is positive or negative.
 */

 import java.util.Scanner;

 public class Exercise1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Input a number: ");
        int input = in.nextInt();

        if (input > 0) {
            System.out.println("Number is positive.");
        } else if (input < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
    }
 }