/**
 * Sum of Digits in Integer
 * Write a Java method to compute the sum of digits in an integer.
 * Test Data:
 * Input an integer: 25
 */

 import java.util.Scanner;

 public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int digits = in.nextInt();

        System.out.println("The sum of digits are: " + sumOfD(digits));
    }

    public static int sumOfD(long n) {
        int result = 0;

        while(n > 0) {
            result += n %10;
            n /= 10;
        }
        return result;
    }
 }