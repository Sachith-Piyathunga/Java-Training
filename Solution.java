/**
 * Write a Java program to find the value of a specified expression.
 * a) 101 + 0) / 3
 * b) 3.0e-6 * 10000000.1
 * c) true && true
 * d) false && truee) (false && false) || (true && true)
 * f) (false || false) && (true && true)
 */

 public class Solution {
    public static void main(String []args) {
        int a1 = (101 + 0) / 3;
        double a2 = 3.0e-6 * 10000000.1;
        boolean a3 = true && true;
        boolean a4 = false && true;
        boolean a5 = (false && false) || (true && true);
        boolean a6 = (false || false) && (true || true);

        System.out.println("101 + 0) / 3 --> " + a1);
        System.out.println("3.0e-6 * 10000000.1 --> " + a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

    }
 }