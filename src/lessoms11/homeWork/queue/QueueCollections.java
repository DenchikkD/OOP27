package lessoms11.homeWork.queue;

import lessoms11.homeWork.Node;
import lessoms11.homeWork.Queue;

/**
 * Created by Iliren on 01.09.2016.
 */
public class QueueCollections implements Queue {
    private Node head;
    private Node tail;
    private int size;

    public QueueCollections() {
        size = 0;
    }

    @Override
    public boolean push(int element) {
        Node node = new Node(element);
        if (head != null) {
            tail.next = node;
            tail = node;
        } else {
            head = tail = node;
        }
        size++;
        return true;
    }

    @Override
    public Integer pop() {
        Integer element = null;
        if (head != tail) {
            element = take();
            head = head.next;
            size--;
        } else {
            element = take();
            head = tail = null;
            size--;
        }

        return element;
    }

    @Override
    public Integer take() {
        if (!isEmpty()) {
            return head.value;
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
}
