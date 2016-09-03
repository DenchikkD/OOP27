package lessons12;

import java.util.DoubleSummaryStatistics;
import java.util.Formatter;

/**
 * Created by Iliren on 03.09.2016.
 */
public class TestClass {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Double d1 = 1.5;
        Double d2 = 1.5;
        System.out.println(d1==d2);
        byte b =0;
        while (++b>0){
//            System.out.println(b);
        }
        System.out.println(b);

        Formatter formatter = new Formatter();
        formatter.format("%.0f",Math.pow(2,100));
        System.out.println(formatter);

    }

    public static void test(String... strings) {

    }
}
