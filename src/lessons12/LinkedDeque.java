package lessons12;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Denni on 01.09.2016.
 */
public class LinkedDeque implements Deque {

    private Node first;
    private Node last;
    private int size;

    public LinkedDeque() {
        size = 0;
    }

    @Override
    public boolean pushFirst(int elem) {

        if (size == 0) {
            last = first = new Node(elem);
        } else {
            Node node = new Node(elem);
            node.next = first;
            first.prev = node;
            first = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean pushLast(int elem) {
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
    public Integer popFirst() {
        if (!isEmpty()) {
            int elem = first.val;
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
    public Integer popLast() {
        if (!isEmpty()) {
            int elem = last.val;
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
    public Integer ptakeFirst() {
        if (!isEmpty()) {
            return first.val;
        }
        return null;
    }

    @Override
    public Integer takeLast() {
        if (!isEmpty()) {
            return last.val;
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
    static class Node {
        Node next;
        Node prev;
        int val;

        public Node(int val) {
            this.val = val;
        }

        // из  нестед класа игнорируя
        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }

    public void forEachFirst(Consumer<Integer> cons) {
        for (Node nd = first; nd != null; nd = nd.next) {
            cons.accept(nd.val);
        }

    }

    public void forEachLast(Consumer<Integer> cons) {
        System.out.println();
        for (Node nd = last; nd != null; nd = nd.prev) {
            cons.accept(nd.val);
        }

    }

    //*
    public Deque map(Function<Integer, Integer> mapper) {
//        LinkedDeque linkedDeque = this;
        for (Node nd = first; nd != null; nd = nd.next) {
            nd.val = mapper.apply(nd.val);
        }
        return this;
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



