package lessons12;

/**
 * Created by Denni on 01.09.2016.
 */
public interface Deque<T> {


    boolean pushFirst(T elem);

    boolean pushLast(T elem);

    T popFirst();

    T popLast();

    T ptakeFirst();

    T takeLast();

    public int size();

    boolean isEmpty();
}
