package hashSet;

/**
 * Created by Iliren on 21.09.2016.
 */
public abstract class MyAbstarctSet<T> implements MySet<T> {


    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
