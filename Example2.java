/**
 * Split Whole and Fractional Parts
 * 
 * Write a Java program to get whole and fractional parts from a double value.
 */

 import java.util.*;


 public class Example2 {
    
    public static void main(String[] args) {
        double value = 12.56;
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;
        
    }
 }