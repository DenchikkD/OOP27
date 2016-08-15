package lessons9.figure;

/**
 * Created by Denni on 15.08.2016.
 */
public class Figure {


    public Figure() {

    }

    public double area() {
        return 0;
    }

    public double perim() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("peri : %05.2f, area : %05.2f", perim(), area());
    }
}
