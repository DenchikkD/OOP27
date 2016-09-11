package lessons13;

import lessons13.arrayList.ArrayList;

/**
 * Created by Denni on 07.09.2016.
 */
public class MainList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> arrayListq = new java.util.ArrayList<>();
//        System.out.println(arrayListq.get(0));
//        arrayListq.add(1);
//        arrayListq.add(15);
//        arrayListq.add(12);
//        arrayListq.add(1);
//        arrayListq.add(13);
//        for (Integer i:arrayListq) {
//            System.out.println(i);
//        }
//        System.out.println(arrayListq);
//        System.out.println(arrayListq.removeIf(integer -> integer < 10));


//        System.out.println(arrayListq);

//        System.out.println(arrayListq.subList(3, 3));

//        ArrayList<Integer> integerArrayList = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("3");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        System.out.println(arrayList.size());
        for (String arrL : arrayList) {
            System.out.println(arrL);

        }
//        System.out.println(arrayList.reduce((integer, integer2) -> (integer + integer2), ""));
//
//        System.out.println(arrayList.subList(3,3));
//        arrayList.clear();


    }
}
