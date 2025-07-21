/**
 * Round Up Integer Division
 * 
 * Write a Java program to round up integer division results.
 */

import java.util.*;


public class Example1 {
    
    public static void main(String[] args) {
        int tot_theory_marks = 350, tot_practical_marks = 90, tot_marks = 500;
        int percentage_of_marks = ((tot_theory_marks + tot_practical_marks)*100)/tot_marks;

        System.out.println("\nPercentage of Marks: " + percentage_of_marks + "%\n");
    }
}