/**
 * Convert Fahrenheit to Celsius
 * Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
 */

 import java.util.Scanner;

 public class Exercise1  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a dgree in fahrenheit: ");
        double fahrenheit = in.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + "dgree of fahrenheit is equal to " + celsius + " in celsius");
        
    }
 }