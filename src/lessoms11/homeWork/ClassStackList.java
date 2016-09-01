package lessoms11.homeWork;

/**
 * Created by Denni on 31.08.2016.
 */
public class ClassStackList implements Stack {


    private Node tail;
    private Node head;
    private int size;

    public ClassStackList() {
        size=0;
    }

    @Override
    public boolean push(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = tail = node;
        }else{

            tail=node;
        }

        return false;
    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Integer take() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
