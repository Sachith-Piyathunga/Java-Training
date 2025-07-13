/**
 * Solve Quadratic Equation
 * Write a Java program to solve quadratic equations (use if, else if and else).
 */

 import java.util.Scanner;

 public class Exercise2  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = in.nextDouble();
        System.out.println("Enter the second number: ");
        double b = in.nextDouble();
        System.out.println("Enter the third number: ");
        double c = in.nextDouble();

        double result = b*b -  4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("Thw root is " + r1);
        } else {
            System.out.println("Thw equation has no real root.");
        }
    }
 }