/**
 * 
 * Convert Inches to Meters
 * Write a Java program that reads a number in inches and converts it to meters.
 * 
 */

 import java.util.Scanner;

 public class Exercise2  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of inch: ");
        double inch = in.nextDouble();
        double meters = inch * 0.0254;

        System.out.println(inch + " inch is " + meters + " meters.");
    }
 }