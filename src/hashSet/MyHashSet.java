package hashSet;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Iliren on 21.09.2016.
 */
public class MyHashSet<T> extends MyAbstarctSet<T> implements MySet<T> {

    static final int DEFAULT_INITIAL_CAPACITY = 5;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private int count;
    private int size;
    private Node<T>[] arr;

    public MyHashSet() {
        count = 0;
        size = 0;
        arr = (Node<T>[]) new Node[DEFAULT_INITIAL_CAPACITY];

    }


    @Override
    public boolean add(T e) {
        Node<T> node = new Node<>(e);
        int idx = hash(e);
        if (arr[idx] == null) {
            count++;
            arr[idx] = node;
            size++;
        } else {
            Node<T> position = arr[idx];
            while (position.next != null && !checkEquality(position, e)) {
                position = position.next;
            }
            if (checkEquality(position, e)) {
                return false;
            } else {
                position.next = node;
                size++;
            }
        }
        return true;
    }

    private void newArray(Node<T>[] oldAarray) {
        Node<T>[] newArr = (Node<T>[]) new Node[(int) (oldAarray.length * 1.2)];

        for (int i = 0; i < oldAarray.length; i++) {
            if (oldAarray[i] != null) {
                Node<T> position = oldAarray[i];
                Node<T> oldposition = position;
                while (position != null) {
//                    add(newArr, oldposition.element);
//                    int idx = hash(position.element);
//                    if (newArr[idx] == null) {
//                        newArr[idx] = oldposition;
//                    } else {
//                        Node<T> newArrPosition = newArr[idx];
//                        while (newArrPosition.next != null) {
//                            newArrPosition = newArrPosition.next;
//                        }
//                        newArrPosition.next = oldposition;
//                    }
                    position = position.next;
//                    oldposition.next = null;
                }
            }
        }
        this.arr = newArr;
    }

    private boolean checkEquality(Node<T> position, T element) {
        if (position.element == null || element == null) {
            if (position.element == element) {
                return true;
            }
        } else {
            if (position.element.equals(element)) {
                return true;
            }
        }
        return false;
    }

    private int hash(T e) {

        return (e == null) ? 0 : e.hashCode() % arr.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T e) {
        if (!isEmpty()) {
            int idx = hash(e);
            if (idx >= 0 && idx < arr.length) {
                Node<T> position = arr[idx];
                while (position != null && position.next != null) {
                    if (checkEquality(position, e)) {
                        return true;
                    }
                    position = position.next;
                }
            }
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if (size() != 0) {
            for (int i = 0; i < arr.length; i++) {
//                builder.append(System.lineSeparator());
                if (arr[i] != null) {
                    Node<T> position = arr[i];
                    while (position != null) {
                        if (builder.length() == 1) {
                            builder.append(position.element);
                        } else {
                            builder.append(", ").append(position.element);
                        }
                        position = position.next;
                    }
                }
            }
        }
        builder.append("]");
        return builder.toString();
    }


    private static class Node<E> {

        Node<E> next;
        E element;

        public Node(E element) {
            this.element = element;
        }
    }
}
