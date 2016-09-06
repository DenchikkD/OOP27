package lessoms11.homeWork;

/**
 * Created by Denni on 22.08.2016.
 */
public interface Stack<E> {
    boolean push(E element);

    E pop();

    E take();

    int size();

    boolean isEmpty();


}
