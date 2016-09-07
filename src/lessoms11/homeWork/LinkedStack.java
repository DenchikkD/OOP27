//package lessoms11.homeWork;
//
///**
// * Created by Denni on 31.08.2016.
// */
//public class LinkedStack implements Stack {
//
//    private int size;
//    private Node tail;
//
//    public LinkedStack() {
//        size = 0;
//    }
//
//
//    @Override
//    public boolean push(int element) {
//        Node node = new Node(element);
//        node.next = tail;
//        tail = node;
//        size++;
//        return true;
//    }
//
//    @Override
//    public Integer pop() {
//        if (!isEmpty()) {
//            Integer element = take();
//            if (tail.next != null) {
//                tail = tail.next;
//            } else {
//                tail = null;
//            }
//            size--;
//            return element;
//        }
//        return null;
//    }
//
//
//    @Override
//    public Integer take() {
//        Integer element = null;
//        if (size != 0) {
//            element = tail.value;
//        }
//        return element;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return size == 0;
//    }
//}
