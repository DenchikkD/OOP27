package lessons9.figure;

import java.util.ArrayList;

/**
 * Created by Denni on 16.08.2016.
 */
public class MainFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(6);
        Triangle triangle = new Triangle(4, 6);

        ArrayList<AbstractFigure> list = new ArrayList<>();
        list.add(circle);
        list.add(rectangle);
        list.add(square);
        list.add(triangle);

        for (AbstractFigure f:list) {
            System.out.println(f);

        }
    }
}
