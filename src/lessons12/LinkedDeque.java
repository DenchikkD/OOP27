package lessons12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.jar.Pack200;

import static javafx.scene.input.KeyCode.O;

/**
 * Created by Denni on 01.09.2016.
 */
public class LinkedDeque<E> implements Deque<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public LinkedDeque() {
        size = 0;
    }

    @Override
    public boolean pushFirst(E elem) {

        if (size == 0) {
            last = first = new Node<>(elem);
        } else {
            Node<E> node = new Node<E>(elem);
            node.next = first;
            first.prev = node;
            first = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean pushLast(E elem) {
        if (size == 0) {
            last = first = new Node(elem);
        } else {
            Node node = new Node(elem);
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
        return true;
    }

    @Override
    public E popFirst() {
        if (!isEmpty()) {
            E elem = (E) first.val;
            if (first == last) {
                first = last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            size--;
            return elem;
        }
        return null;
    }

    @Override
    public E popLast() {
        if (!isEmpty()) {
            E elem = (E) last.val;
            if (last == first) {
                last = first = null;
            } else {
                last = last.prev;
                last.next = null;
            }
            size--;
            return elem;
        }
        return null;
    }

    @Override
    public E ptakeFirst() {
        if (!isEmpty()) {
            return (E) first.val;
        }
        return null;
    }

    @Override
    public E takeLast() {
        if (!isEmpty()) {
            return (E) last.val;
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

    // inner class
//    class  Node2{
//
//}
    //nested class
    static class Node<U> {
        Node<U> next;
        Node<U> prev;
        U val;

        public Node(U val) {
            this.val = val;
        }

        // из  нестед класа игнорируя
        public Node(Node<U> next, Node<U> prev, U val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }

    public void forEachFirst(Consumer<E> cons) {
        for (Node nd = first; nd != null; nd = nd.next) {
            cons.accept((E) nd.val);
        }

    }

    public void forEachLast(Consumer<E> cons) {
        System.out.println();
        for (Node nd = last; nd != null; nd = nd.prev) {
            cons.accept((E) nd.val);
        }

    }

    //*
    public <V> Deque<V> map(Function<E, V> mapper) {
        Deque<V> res = new LinkedDeque<>();
        for (Node<E> nd = first; nd != null; nd = nd.next) {
            res.pushLast(mapper.apply(nd.val));

        }
        return res;
    }


    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");

        for (Node nd = first; nd != null; nd = nd.next) {
            sb.append(nd.val);
            if (nd.next != null) {
                sb.append(", ");
            } else {
                sb.append("]");
            }
        }
        return sb.toString();
    }


}



