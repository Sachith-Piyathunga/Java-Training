/**
 * Sum of Digits in Integer
 * Write a Java program that reads an integer between 0 and 1000 and adds all the 
 * digits in the integer.
 */

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer 0 to 1000: ");
        int num = in.nextInt();
        
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int forthDigit = remainingNumber % 10;

        int sum = thirdDigit + SecondDigit + firstDigit + forthDigit;
        System.out.println("The sum of all digits  in " + num + " is: " + sum);
    }
 }