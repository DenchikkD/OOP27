package lessoms11.homeWork;

/**
 * Created by Denni on 29.08.2016.
 */
public class ClassStackArray implements Stack {

    private int maxSize;
    private int[] array;
    private int size;
    private int hesd;
    private int tail;

    public ClassStackArray(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        size = 0;
        hesd = 0;
        tail = 0;
    }


    @Override
    public boolean push(int element) {
        if (hesd <= maxSize) {
            array[hesd++] = element;
            size++;
            return true;
        }
        return false;
    }


    @Override
    public Integer pop() {
        int res = take();
        tail++;
        size--;
        return res;
    }

    @Override
    public Integer take() {
        if (!isEmpty()) {
            return array[tail];
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
