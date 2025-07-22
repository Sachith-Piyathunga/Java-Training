import java.util.Scanner;

/**
 * Integer to Absolute Value
 * 
 * Write a Java program to convert an integer value to an absolute value.
 */


public class Exercise8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer number: ");
        int x = in.nextInt();
        System.out.printf("The absolute value of %d is: %d",x, convert (x));
        System.out.printf("\n");
    }

    public static int convert (int n) {

        int absvalue = (n >= 0) ? n : -n;
        return absvalue;
    }
}
