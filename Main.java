/**
 * Display Factors of 3 in Integer
 * Write a Java method to display the factors of 3 in a given integer.
 */

 import java.util.Scanner;

 public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int n = in.nextInt();
        System.out.println("Factors of 3 of the said integer: \n");
        test(n);
    }

    public static void test(int n) {
        System.out.println(n + " = ");
        int result = n;
        while (result % 3 == 0) {
            System.out.println("3 * ");
            result = result / 3;
        }
        System.out.println(result);
    }

 }