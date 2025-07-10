/**
 * Compute Future Investment Value
 * Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
 * Sample data (Monthly compounded):
 * Input the investment amount: 1000
 * Input the rate of interest: 10
 * Input number of years: 5
 */

 import java.util.Scanner;

 public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double investment = in.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = in.nextDouble();
        System.out.println("Enter number of year: ");
        int year = in.nextInt();

        rate *= 0.01;

        System.out.println("Years future Value ");
        for (int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) formatter = 18;
            System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate/12, i)); 
        }
    }

    public static double futureInvestmentValue(double interestAmount, double monthlyInterestRate, int years) {
        return interestAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
 }