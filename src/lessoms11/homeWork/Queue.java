package lessoms11.homeWork;

/**
 * Created by Denni on 22.08.2016.
 */
public interface Queue<T> {
    boolean push(T element);

    T pop();

    T take();

    int size();

    boolean isEmpty();
}
