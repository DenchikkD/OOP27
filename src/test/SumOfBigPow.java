package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 * Created by Denni on 02.09.2016.
 */
public class SumOfBigPow {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(2);
        System.out.println(sumOfBigPow(String.valueOf(bigInteger.pow(100))));
    }

    public static Integer sumOfBigPow(String str) {
        System.out.println(str);
        Integer sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }


}
