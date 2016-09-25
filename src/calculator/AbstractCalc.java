package calculator;

/**
 * Created by Denni on 9/24/2016.
 */
public abstract class AbstractCalc implements Calculator{
    protected String result;
    protected int temp;
    protected char operation;
    @Override
    public void printResult(){
        System.out.println("Result = " + result);
    }
    public String getResult(){
        return result;
    }
}
