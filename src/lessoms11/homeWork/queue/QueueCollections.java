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
        return false;
    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Integer take() {
        return head.value;
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
