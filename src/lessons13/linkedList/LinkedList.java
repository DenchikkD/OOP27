package lessons13.linkedList;

import lessons13.List;


import java.util.Iterator;
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
        if (idx != size()) {
            checkIdx(idx);
        }
        Node<E> node = new Node<>(element);

        if (size() == 0) {
            head = tail = node;
        } else if (idx == 0) {
            head.prev = node;
            node.next = head;
            head = node;
        } else if (idx == size()) {

            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            Node<E> tmp = findNodeByIdx(idx);
            tmp.prev.next = node;
            node.prev = tmp.prev;
            node.next = tmp;
            tmp.prev = node;
        }
        size++;

    }

    @Override
    public E get(int idx) {

        return checkElementForNull(findNodeByIdx(idx));
    }

    @Override
    public E set(int idx, E element) {
        Node<E> tmp = findNodeByIdx(idx);
        E delValue = checkElementForNull(tmp);
        tmp.element = element;
        return delValue;
    }

    @Override
    public E remove(int idx) {
        Node<E> delNode;
        if (idx == 0) {
            delNode = head;
            head = head.next;
            head.prev = null;
        } else if (idx == size() - 1) {
            delNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<E> tmp = findNodeByIdx(idx);
            delNode = tmp;
            tmp.prev.next = delNode.next;
            tmp.next.prev = delNode.prev;
        }
        size--;
        return checkElementForNull(delNode);
    }

    @Override
    public boolean remove(E o) {
        if (o == null) {
            if (o == head.element) {
                head = head.next;
                head.prev = null;
                size--;
                return true;
            } else if (o == tail.element) {
                tail = tail.prev;
                tail.next = null;
                size--;
                return true;
            } else {
                for (Node<E> nd = head; nd != null; nd = nd.next) {
                    if (nd.element == o) {
                        nd.prev.next = nd.next;
                        nd.next.prev = nd.prev;
                        size--;
                        return true;
                    }
                }
            }
        } else {
            if (o.equals(head.element)) {
                head = head.next;
                head.prev = null;
                size--;
                return true;
            } else if (o.equals(tail.element)) {
                tail = tail.prev;
                tail.next = null;
                size--;
                return true;
            } else {
                for (Node<E> nd = head; nd != null; nd = nd.next) {
                    if (o.equals(nd.element)) {
                        nd.prev.next = nd.next;
                        nd.next.prev = nd.prev;
                        size--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeIf(Predicate<E> prd) {
        boolean ifDel = false;
        for (Node<E> nd = head; nd != null; nd = nd.next) {
            if (prd.test(nd.element)) {
                remove(nd.element);
                ifDel = true;
            }
        }
        return ifDel;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iter = new Iterator<E>() {
            Node<E> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                E val = checkElementForNull(node);
                node = node.next;
                return val;
            }
        };
        return iter;
    }

    @Override
    public void forEach(Consumer<? super E> cons) {
        for (Node<E> nd = head; nd != null; nd = nd.next) {
            cons.accept(nd.element);
        }

    }

    @Override
    public <T> List<T> map(Function<E, T> func) {
        List<T> result = new LinkedList<>();
        for (Node<E> nd = head; nd != null; nd = nd.next) {
            result.add(func.apply(nd.element));
        }
        return result;
    }

    @Override
    public E reduce(BiFunction<E, E, E> func, E initial) {
        for (Node<E> nd = head; nd != null; nd = nd.next) {
            initial = func.apply(initial, nd.element);
        }
        return initial;

    }

    @Override
    public int indexOf(E o) {
        int count =0;

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

    private void checkIdx(int idx) {
        if (idx >= size() || idx < 0) {
            throw new IndexOutOfBoundsException("My Exception " + "idx: " + idx + " size: " + size());
        }
    }

    private Node<E> findNodeByElement(E o) {
        Node<E> tmp = null;
        for (Node<E> nd = head; nd.next != null; nd = nd.next) {
            if (checkElementForNull(nd) != null && o != null) {
                if (nd.element.equals(o)) {
                    tmp = nd;
                }
            } else {
                if (nd.element == o) {
                    tmp = nd;
                }
            }
        }

        return tmp;
    }

    private Node<E> findNodeByIdx(int idx) {
        checkIdx(idx);
        Node<E> tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    private E checkElementForNull(Node<E> node) {
        if (node.element != null) {
            return node.element;
        }
        return null;
    }


    private static class Node<E> {
        private Node<E> next;
        private Node<E> prev;
        private E element;

        public Node(E element) {
            this.element = element;
        }
    }
}
