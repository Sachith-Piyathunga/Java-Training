/**
 * Print Characters Between Two Characters
 * Write a Java method to print characters between two characters (i.e. A to P).
 * Note: Prints 20 characters per line
 */

 public class Exercise9 {
    public static void main(String[] args) {
        print_chars('(' , 'Z', 20);
    }

    public static void print_chars(char char1, char char2, int n) {
        for(int ctr = 1; char1 <= char2; ctr++, char1++){
            System.out.println(char1 + " ");
            if(ctr % n == 0)System.out.println("");
        }
        System.out.println("\n");
    } 
 }