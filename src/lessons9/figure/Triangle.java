package lessons9.figure;

/**
 * Created by Denni on 15.08.2016.
 */
public class Triangle extends AbstractFigure {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public double area() {
        return 0.5 * a * b;
    }

    @Override
    public double perim() {
        return 0;
    }

    @Override
    public String getName() {
        return "Triangle :)";
    }
}
