package calculator;

/**
 * Created by Denni on 9/24/2016.
 */
public abstract class AbstractCalc implements Calculator {
    protected String result = "";
    protected int temp;
    protected char operation;

    @Override
    public void printResult() {
        System.out.println("Result = " + result);
    }

    public String getResult() {
        return result;
    }

    public String multiply() {
        return String.valueOf(temp * Integer.valueOf(result));
    }

    public String divide() {
        return String.valueOf(temp / Integer.valueOf(result));
    }

    public String added() {
        return String.valueOf(temp + Integer.valueOf(result));
    }

    public String subtraction() {
        return String.valueOf(temp - Integer.valueOf(result));
    }

    public void doResult() {
        switch (operation) {
            case '*':
                result = multiply();
                break;
            case '/':
                if (result.equals("0")) {
                    result = ByZero;
                } else {
                    result = divide();
                }
                break;
            case '+':
                result = added();
                break;
            case '-':
                result = subtraction();
                break;
        }
    }
}
