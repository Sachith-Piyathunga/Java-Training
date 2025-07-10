/**
 * Write a Java method to create a pentagon's area.
 */

 import java.util.Scanner;

 public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of sieds: ");
        int n = in.nextInt();
        System.out.println("Enter a side: ");
        double side = in.nextDouble();

        System.out.println("The area of the pentagon is " + pentagon_area(n, side));
    }

    public static double pentagon_area(int n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
 }