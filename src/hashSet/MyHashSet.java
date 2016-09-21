package hashSet;

/**
 * Created by Iliren on 21.09.2016.
 */
public class MyHashSet<T> extends MyAbstarctSet<T> implements MySet<T> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private int size;
    private Node<T>[] arr;

    public MyHashSet() {
        size = 0;
        arr = (Node<T>[]) new Node[DEFAULT_INITIAL_CAPACITY];

    }

    @Override
    public boolean add(T e) {
        Node<T> node = new Node<>(e);
        int idx = e.hashCode() % arr.length;
        if (arr[idx] == null) {
//            System.out.println(idx+" "+arr[idx]);
            arr[idx] = node;
            size++;
//            System.out.println(idx+" "+arr[idx]);

        } else {

            Node<T> position = arr[idx];
            while (position.next != null && !position.element.equals(node.element)) {
                position = position.next;
            }
            if (position.element.equals(node.element)) {
                position.element = node.element;
            } else {
                position.next = node;
                size++;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if (size() != 0) {
            for (int i = 0; i < arr.length; i++) {
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
