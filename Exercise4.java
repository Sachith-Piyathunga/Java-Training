/**
 * Check Positive, Negative, or Zero (with Range)
 */

 import java.util.Scanner;

 public class Exercise4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = in.nextDouble();

        if (number > 0) {
            if (number > 1) {
                System.out.println("Number is positive and small number.");
            } else if (number > 1000000) {
                System.out.println("Number is positive and large number.");
            } else {
                System.out.println("Number is positive.");
            }
        } else if (number < 0) {
            if (Math.abs(number) < 1) {
                System.out.println("Number is negative and small number.");
            } else if (Math.abs(number) < 1000000) {
                System.out.println("Number is negative and large number.");
            } else {
                System.out.println("Number is negative.");
            }
        } else {
            System.out.println("Zero");
        }
    }
 }