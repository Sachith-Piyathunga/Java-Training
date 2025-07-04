//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {  
    /**
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output
     * 2.138888888888889
     */
    double a = 25.5;
    double b = 3.5;
    double c = 40.5;
    double e = 4.5;

    double result = ((a * b - b * b) / (c - e));

    System.out.println("The final result is: " + result);
    
	}
}