package lessons9.figure;

/**
 * Created by Denni on 15.08.2016.
 */
public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perim() {
        return 2*a+2*b;
    }
}
