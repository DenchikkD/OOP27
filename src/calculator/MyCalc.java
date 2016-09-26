package calculator;

/**
 * Created by Denni on 9/24/2016.
 */
public class MyCalc extends AbstractCalc {
    public MyCalc() {

    }

    @Override
    public void inChar(char p) {
        switch (p) {
            case '1':
                generateValue(p);
                break;
            case '2':
                generateValue(p);
                break;
            case '3':
                generateValue(p);
                break;
            case '4':
                generateValue(p);
                break;
            case '5':
                generateValue(p);
                break;
            case '6':
                generateValue(p);
                break;
            case '7':
                generateValue(p);
                break;
            case '8':
                generateValue(p);
                break;
            case '9':
                generateValue(p);
                break;
            case '0':
                generateValue(p);
                break;
            case '/':
                temp = Integer.parseInt(result);
                result = "";
                operation = '/';
                break;
            case '*':
                temp = Integer.parseInt(result);
                result = "";
                operation = '*';
                break;
            case '-':
                temp = Integer.parseInt(result);
                result = "";
                operation = '-';
                break;
            case '+':
                temp = Integer.parseInt(result);
                result = "";
                operation = '+';
                break;
            case '=':
                doResult();
                break;
        }

    }

    private void generateValue(char p) {
        result += p;

    }


}
