/**
 * Round Float Value
 * 
 * Write a Java program to accept a float value of a number and return a rounded float value.
 * Sample data:
 * Input a float number: 12.51
 * The rounded value of 12.510000 is: 13.00
 * Input a float number: 12.49999
 * The rounded value of 12.499990 is: 12.00
 */
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a float number: ");

        float x = in.nextFloat();
        System.out.printf("The rounded value of %f is: %.2f",x, round_num(x));
        System.out.printf("\n");
    }

    public static float round_num(float fn) {
        
        float f_num = (float)Math.floor(fn);
        float c_num = (float)Math.ceil(fn);

        if ((fn - f_num) > (c_num - fn))
			{
				return c_num;
				}
		else if ((c_num - fn) > (fn - f_num)) 
		{
			return f_num;
			}
		else 
		{ 
	       return c_num; 
		   }
    }
}
