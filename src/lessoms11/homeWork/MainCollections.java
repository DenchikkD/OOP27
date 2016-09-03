package lessoms11.homeWork;

import lessoms11.homeWork.queue.QueueCollections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Iliren on 01.09.2016.
 */
public class MainCollections {
    public static void main(String[] args) {
        QueueCollections queueCollections = new QueueCollections();
        System.out.println(queueCollections.size());
        System.out.println(queueCollections.isEmpty());
        System.out.println(queueCollections.take());
        System.out.println(queueCollections.push(10));
        System.out.println(queueCollections.push(15));
        System.out.println(queueCollections.take());
        System.out.println(queueCollections.pop());
        System.out.println(queueCollections.size());
        System.out.println(queueCollections.take());
        System.out.println(queueCollections.pop());
        System.out.println(queueCollections.size());
        System.out.println(queueCollections.push(5));
        System.out.println(queueCollections.take());
        System.out.println(queueCollections.pop());



    }

}
