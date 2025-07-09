/**
 * Find Middle Character(s) of String
 * Write a Java method to display the middle character of a string.
 * Note: 
 * a) If the length of the string is odd there will be two middle characters.
 * b) If the length of the string is even there will be one middle character.
 * 
 * Test Data:
 * Input a string: 350
 */

 import java.util.Scanner;

 public class Exercise3 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scr.nextLine();
        System.out.println("The middle caracter in the string is: " + middle(str) + "\n");
    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position,position + length);
    }
 }