/**
 * Round Float to Specified Decimals
 * 
 * Write a Java program to round a float number to specified decimals.
 */

import java.lang.*;
import java.math.BigDecimal;

public class Example4 {

    public static void main(String[] args) {
        float x = 451.3256412f;
        BigDecimal result;
		int decimal_place = 4;

        BigDecimal num  = new BigDecimal(Float.toString(x));
        num = num.setScale(decimal_place, BigDecimal.ROUND_HALF_UP);
        
    }
}