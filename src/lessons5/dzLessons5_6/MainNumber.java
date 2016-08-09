package lessons5.dzLessons5_6;

/**
 * Created by Iliren on 03.08.2016.
 */
public class MainNumber {
    public static void main(String[] args) {
        Number num1 = new Number(5);
        Number num2 = new Number(3);
        System.out.println(num2.get());
        System.out.println(num1.add(num2).get());
        System.out.println(num1.fact().get());

    }
}
