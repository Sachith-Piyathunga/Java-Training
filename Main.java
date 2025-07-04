//import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {  
    Scanner scr = new Scanner(System.in);

    System.out.println("Enter your first number: ");
    int num1 = scr.nextInt();

    System.out.println("Enter your seconed number: ");
    int num2 = scr.nextInt();

    System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		
	}
}