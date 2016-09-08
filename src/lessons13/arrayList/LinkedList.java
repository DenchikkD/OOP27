package lessons13.arrayList;

import lessons13.List;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Denni on 08.09.2016.
 */
public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {
    }

    @Override
    public void add(E element) {
        add(size(), element);
    }

    @Override
    public void add(int idx, E element) {
//        if (head == null) {
//            head = tail = new Node(element);
//        } else {
//            Node<E> node = new Node<>(element);
//            tail.next = node;
//            node.prev = tail;
//            tail = node;
//        }
//        size++;
    }

    @Override
    public E get(int idx) {
        return null;
    }

    @Override
    public E set(int idx, E element) {
        return null;
    }

    @Override
    public E remove(int idx) {
        return null;
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<E> prd) {
        return false;
    }

    @Override
    public void forEach(Consumer<E> cons) {

    }

    @Override
    public <T> List<T> map(Function<E, T> func) {
        return null;
    }

    @Override
    public E reduce(BiFunction<E, E, E> func, E initial) {
        return null;
    }

    @Override
    public int indexOf(E o) {
        return 0;
    }

    @Override
    public int lastIndexOf(E o) {
        return 0;
    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public List<E> subList(int fromIdx, int toIdx) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean addAll(List<? extends E> list) {
        return false;
    }

    @Override
    public boolean addAll(int idx, List<? extends E> list) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");

        for (Node nd = head; nd != null; nd = nd.next) {
            sb.append(nd.element);
            if (nd.next != null) {
                sb.append(", ");
            } else {
                sb.append("]");
            }
        }
        return sb.toString();
    }


    private static class Node<E> {
        Node<E> next;
        Node<E> prev;
        E element;

        public Node(E element) {
            this.element = element;
        }
    }
}
