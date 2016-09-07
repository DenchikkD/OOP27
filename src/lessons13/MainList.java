package lessons13;

import lessons13.arrayList.ArrayList;

/**
 * Created by Denni on 07.09.2016.
 */
public class MainList {

    public static void main(String[] args) {

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

    }
}
