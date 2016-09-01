package lessons12;

/**
 * Created by Denni on 01.09.2016.
 */
public interface Deque {


    boolean pushFirst(int elem);

    boolean pushLast(int elem);

    Integer popFirst();

    Integer popLast();

    Integer ptakeFirst();

    Integer takeLast();

    public int size();

    boolean isEmpty();
}
