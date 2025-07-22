/**
 * Roman to Integer Conversion
 * 
 * Write a Java program to convert a Roman number to an integer number.
 */

public class Example7 {
    public static void main(String[] args) {
        
        String str = "DCCVII";
        int len = str.length();

            str = str + " ";
            int result = 0;
            for(int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                char next_char = str.charAt(i + 1);

                if (ch == 'M') {
                    result += 1000;
                } else if (ch == 'C') {
                    if (next_char == 'M') {
                        result += 900;
                        i++;
                    } else if (next_char == 'D') {
                        result += 400;
                        i++;
                    }
                }
            }
    }
    
}
