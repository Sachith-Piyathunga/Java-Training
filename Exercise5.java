/**
 * Count Words in String
 * Write a Java method to count all the words in a string.
 * Test Data:
 * Input the string: The quick brown fox jumps over the lazy dog.
 */

 import java.util.Scanner;

 public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = in.nextLine();

        System.out.println("Number of words in the string: " + wordCount(str) + "\n");
    }

    public static int wordCount(String str) {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count++;
        }
        return count;
    }
 }