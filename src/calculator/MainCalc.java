package calculator;

/**
 * Created by Denni on 9/25/2016.
 */
public class MainCalc {
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        myCalc.inChar('1');myCalc.printResult();
        myCalc.inChar('3');myCalc.printResult();
        myCalc.inChar('4');myCalc.printResult();
        myCalc.inChar('/');myCalc.printResult();
        myCalc.inChar('0');myCalc.printResult();
        myCalc.inChar('=');myCalc.printResult();


    }
}
