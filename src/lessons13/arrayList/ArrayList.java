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

    private int maxSize;
    private T[] array;
    private int size;

    public ArrayList(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        this.size = 0;
    }

    public ArrayList() {
        maxSize = 10;
        array = (T[]) new Object[maxSize];
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

    }

    @Override
    public T get(int idx) {
        return null;
    }

    @Override
    public T set(int idx, T element) {
        return null;
    }

    @Override
    public T remove(int idx) {
        return null;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public void removeIf(Predicate prd) {

    }

    @Override
    public void forEach(Consumer cons) {

    }

    @Override
    public T reduce(BiFunction func, Object initial) {
        return null;
    }

    @Override
    public int indexOf(T o) {
        return 0;
    }

    @Override
    public int lastIndexOf(T o) {
        return 0;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public List subList(int fromIdx, int toIdx) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean addAll(List list) {
        return false;
    }

    @Override
    public boolean addAll(int idx, List list) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public List map(Function func) {
        return null;
    }

    private T[] newArray(T[] array) {

        return Arrays.copyOf(array, array.length * 3 / 2 + 1);
    }

    private void shiftRight(int idx){


    }
}
