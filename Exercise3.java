/**
 * Find Greatest Among Three Numbers
 * Write a Java program that takes three numbers from the user and prints 
 * the greatest number.
 */

 import java.util.Scanner;

 public class Exercise3  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = in.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The greatest number is: " + num3);
        } else {
            System.out.println("Invalied input");
        }
    }
 }