package lessons12;

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
            node.prev = first;
            first.next = node;
            first = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean pushLast(int elem) {
        return false;
    }

    @Override
    public Integer popFirst() {
        Integer element = null;
        if (!isEmpty()) {
            if (first.next != null) {
                Node deleteNode = first;
                element = deleteNode.val;
//            deleteNode.next.prev = null;
                first = deleteNode.next;
                first.prev = null;
            } else {

            }

            size--;
        }
        return element;
    }

    @Override
    public Integer popLast() {
        return null;
    }

    @Override
    public Integer ptakeFirst() {
        return first.val;
    }

    @Override
    public Integer takeLast() {
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
    private static class Node {
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

}
