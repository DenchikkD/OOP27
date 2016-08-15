package lessons9.figure;

/**
 * Created by Denni on 15.08.2016.
 */
public class Circle extends Figure {
    private double a;

    public Circle(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(a, 2);
    }

    @Override
    public double perim() {
        return 2 * Math.PI * a;
    }

}
