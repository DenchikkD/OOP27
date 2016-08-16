package lessons9.figure;

/**
 * Created by Denni on 15.08.2016.
 */
public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String getName() {
        return "Square ;)";
    }
}
