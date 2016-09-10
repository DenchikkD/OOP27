package lessons13.arrayList;

import com.sun.istack.internal.NotNull;
import lessons13.List;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Denni on 07.09.2016.
 */
public class ArrayList<T> implements List<T> {

    private static final int NOMINAL_CAPACITY = 10;
    private int maxSize;
    private T[] array;
    private int size;

    public ArrayList(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        this.size = 0;
    }

    public ArrayList() {
        array = (T[]) new Object[NOMINAL_CAPACITY];
        size = 0;
    }

    public ArrayList(@NotNull java.util.List<T> addList) {
        this.array = array;

    }

    @Override
    public void add(T element) {
        if (size == array.length) {
            array = newArray(array);
            array[size++] = element;
        } else {
            array[size++] = element;
        }
    }

    @Override
    public void add(int idx, T element) {
        if (checkIndex(idx - 1)) {
            if (size == array.length) {
                array = newArray(array);
                shiftRight(idx);
                array[idx] = element;
            } else {
                shiftRight(idx);
                array[idx] = element;
            }
            size++;
        }
    }

    @Override
    public T get(int idx) {
        if (!isEmpty()) {
            checkIndex(idx);
            return array[idx];
        }
        throw new IndexOutOfBoundsException("size: " + size + " idx: " + idx);

    }

    @Override
    public T set(int idx, T element) {
        checkIndex(idx);
        T delElement = array[idx];
        array[idx] = element;
        return delElement;
    }

    @Override
    public T remove(int idx) {
        checkIndex(idx);
        T delElement = array[idx];
        shiftLeft(idx);
        size--;
        return delElement;
    }

    @Override
    public boolean remove(T o) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if ((array[i] != null && array[i].equals(o)) || array[i] == null) {
                    shiftLeft(i);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeIf(Predicate<T> pred) {
        boolean ifDell = false;
        for (int i = 0; i < size; i++) {
            if (pred.test(array[i])) {
                remove(i);
                i--;
                ifDell = true;
            }
        }
        return ifDell;
    }

    @Override
    public void forEach(Consumer<T> cons) {
        for (int i = 0; i < size; i++) {
            cons.accept(array[i]);
        }

    }

    @Override
    public T reduce(BiFunction<T, T, T> func, T initial) {
        for (int i = 0; i < size; i++) {
            initial = func.apply(initial, array[i]);
        }
        return initial;
    }

    @Override
    public int indexOf(T o) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        if (!isEmpty()) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    @Override
    public List<T> subList(int fromIdx, int toIdx) {
        checkIndex(fromIdx);
        checkIndex(toIdx);
        List<T> result = new ArrayList<>();
        for (int i = fromIdx; i < toIdx; i++) {
            result.add(array[i]);
        }
        return result;
    }

    @Override
    public void clear() {
        array = (T[]) new Object[NOMINAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean addAll(List<? extends T> list) {
        return addAll(this.size, list);
    }

    @Override
    public boolean addAll(int idx, List<? extends T> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                add(idx, list.get(i));
            }
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public <U> List<U> map(Function<T, U> func) {
        ArrayList<U> result = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            result.add(func.apply(array[i]));
        }
        return result;
    }

    private T[] newArray(T[] array) {
//        System.out.println((array.length * 3) / 2 + 1);
        return Arrays.copyOf(array, (array.length * 3) / 2 + 1);
    }

    private void shiftRight(int idx) {
        System.arraycopy(array, idx, array, idx + 1, array.length - idx - 1);
    }

    private void shiftLeft(int idx) {
        System.arraycopy(array, idx + 1, array, idx, array.length - idx - 1);
    }

    private boolean checkIndex(int idx) {
        if (idx > size || idx < 0) {
            throw new IndexOutOfBoundsException("BLA");
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        if (size == 0) {
            stringBuilder.append("}");
        } else {
            for (int i = 0; i < size; i++) {
                if (i < size - 1) {
                    stringBuilder.append(array[i] + ", ");
                } else {
                    stringBuilder.append(array[i] + "}");
                }
            }
        }
        return stringBuilder.toString();
    }
}
