/**
 * Float to Absolute Value
 * 
 * Write a Java program to convert a floating value to an absolute value.
 */

import java.util.*;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a float number: ");
        float x = in.nextFloat();
        System.out.printf("The absol;ute value of %.2f is: %.2f", x ,convert(x));
        System.out.printf("\n");
    }
}
