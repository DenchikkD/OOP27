package lessoms11.homeWork;

/**
 * Created by Denni on 29.08.2016.
 */
public class ArrayStack<E> implements Stack<E> {

    private int maxSize;
    private E[] array;
    private int size;
    private int tail;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        array = (E[]) new Object[maxSize];
        size = 0;

        tail = 0;
    }


    @Override
    public boolean push(E element) {
        if (tail < maxSize) {
            array[tail++] = element;
            size++;
            return true;
        }
        return false;
    }


    @Override
    public E pop() {
        E res = take();
        tail--;
        size--;
        return res;
    }

    @Override
    public E take() {
        if (!isEmpty()) {
            return array[size - 1];
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
