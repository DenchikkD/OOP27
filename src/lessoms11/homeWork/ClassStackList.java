package lessoms11.homeWork;

/**
 * Created by Denni on 31.08.2016.
 */
public class ClassStackList implements Stack {

    private Node tail;
    private Node head;
    private int size;

    public ClassStackList() {
        size = 0;
    }

    @Override
    public boolean push(int element) {
        Node node = new Node(element);
        if (size > 0) {
            node.next = tail;
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
        if (!isEmpty()) {
            if (tail != null & tail.next != null) {
                element = tail.value;
                tail = tail.next;
            } else {
                element = tail.value;
                head = tail = null;
            }
            size--;
//            return element;
        }
        return element;
    }

    @Override
    public Integer take() {
        if (!isEmpty()) {
            return tail.value;

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
