package lessons1;

import java.util.ArrayList;

/**
 * Created by Denni on 11.07.2016.
 */
public class TaskFirst {
    public static void main(String[] args) {

        int[] array = new int[10];

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(0);
        list.add(8);
        list.add(9);
        list.add(3);
        list.add(0);
//        System.out.println(list);
        list.add(1, 999);

//        System.out.println(list);
        list.set(2, 500);

//        System.out.println(list);
//        list.remove(1);

        System.out.println(list);
//        System.out.println(list.get(0));
//        removeAllodd(list);
//        System.out.println(list);


//        list.removeIf((elem) -> elem % 2 != 0);
        list.removeIf((e) -> {
            System.out.println(e);
            if (e % 2 != 0) {
                System.out.println("remove " + e);
                return true;
            } else {
                return false;
            }

        });
//        System.out.println(list);
        list.forEach((integer) -> System.out.println(integer));
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];

        }

        return result;
    }

    public static void removeAllodd(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0 && list.get(i) != 0) {
                    list.remove(i);
                    i--;
                }

            }
        }


    }

}
