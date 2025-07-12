/**
 * Convert Minutes to Years and Days
 * Write a Java program to convert minutes into years and days.
 */

 import java.util.Scanner;


 public class Exercise4  {
    public static void main(String[] args) {

        double minutesInYear = 60 * 24 * 365;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");

        double min = in.nextDouble();
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximatly " + years + " years and " + days + " days.");
        
    }
 }