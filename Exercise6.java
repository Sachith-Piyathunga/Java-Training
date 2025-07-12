/**
 * Compute BMI
 * Write a Java program to compute the body mass index (BMI).
 */

 import java.util.Scanner;

 public class Exercise6  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the weight in pounds: ");
        double weight = in.nextDouble();

        System.out.println("Enter the hight in inchers: ");
        double inches = in.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println("The BMI value is: " + BMI + "\n");

    }
 }