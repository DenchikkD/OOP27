package lessoms11.homeWork;

/**
 * Created by Denni on 22.08.2016.
 */
public interface Queue {
    boolean push(int element);

    Integer pop();

    Integer take();

    int size();

    boolean isEmpty();
}
