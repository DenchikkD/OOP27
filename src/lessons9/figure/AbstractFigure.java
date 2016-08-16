package lessons9.figure;

/**
 * Created by Denni on 15.08.2016.
 */
public abstract class AbstractFigure implements Figure{
    private String name;

    public AbstractFigure() {

    }

//    public AbstractFigure(String name) {
//        this.name = name;
//    }

//    public abstract String getName();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name : %s perim : %05.2f, area : %05.2f", getName(), perim(), area());
    }
}
