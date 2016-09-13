package lessons16;

import lessoms11.homeWork.Node;

/**
 * Created by Denni on 13.09.2016.
 */
public class TreeSet<E> implements Set<E> {

    Node<E> root;


    @Override
    public boolean add(E e) {
        if (root == null) {
            root = new Node<>(e, null);

        }


        return false;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private static class Node<T> {
        Node<T> parent;
        Node<T> right;
        Node<T> left;
        T elem;

        public Node(T elem, Node<T> parent) {
            this.parent = parent;
            this.elem = elem;
        }
    }

}
