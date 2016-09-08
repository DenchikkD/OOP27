package lessons13;

import lessons13.arrayList.ArrayList;

/**
 * Created by Denni on 07.09.2016.
 */
public class MainList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> arrayListq = new java.util.ArrayList<>();
//        arrayListq.add(1);
//        arrayListq.add(15);
//        arrayListq.add(12);
//        arrayListq.add(1);
//        arrayListq.add(13);
//        System.out.println(arrayListq);
//        System.out.println(arrayListq.removeIf(integer -> integer < 10));
//
//        System.out.println(arrayListq);


        ArrayList<Integer> arrayList = new ArrayList<>(2);
        System.out.println(arrayList.size());
        arrayList.add(3);
        arrayList.add(5);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.add(1, 6);
        arrayList.add(1, 6);
        arrayList.add(arrayList.size(), 78);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(arrayList.size() - 1));
        System.out.println(arrayList.set(0, 100));
        System.out.println(arrayList);
        System.out.println(arrayList.remove(4));
        System.out.println(arrayList);
        arrayList.forEach((e) -> System.out.print(e + " "));
        arrayList.add(null);
        System.out.println();
        System.out.println(arrayList);
        System.out.println(arrayList.remove(null));
        arrayList.add(4,98);
        System.out.println(arrayList);
        System.out.println(arrayList.get(5));

        System.out.println(arrayList.removeIf((e) -> e.equals(5)));
//        arrayList.forEach((e) -> System.out.print(e + " "));


    }
}
