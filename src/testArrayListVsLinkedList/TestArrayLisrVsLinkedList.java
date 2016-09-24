package testArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.LongAccumulator;

/**
 * Created by Iliren on 24.09.2016.
 */
public class TestArrayLisrVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long time1;
        long time2;
        long sum = 0;


        for (int i = 0; i <= 10000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        time1 = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        time2 = System.nanoTime();
        System.out.println(time2 - time1);

        for (int i = 0; i <= 10000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        sum = 0;
        time1 = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            sum += linkedList.get(i);
        }
        time2 = System.nanoTime();
        System.out.println(time2 - time1);

    }
}
