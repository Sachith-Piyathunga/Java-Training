import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double x = in.nextDouble();
        System.out.println("Enter your second number: ");
        double y = in.nextDouble();
        System.out.println("Enter your third number: ");
        double z =  in.nextDouble();
        System.out.println("Print average of the values: " + average(x, y, z) + "\n");

    }
    public static double average(double x, double y, double z) {
        return (x + y + z)/3;
    }
}