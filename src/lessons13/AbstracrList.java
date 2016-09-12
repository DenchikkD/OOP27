package lessons13;

/**
 * Created by Denni on 12.09.2016.
 */
public abstract class AbstracrList<E> implements List<E> {
    @Override
    public void add(E element) {
        add(size(), element);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }


}
