package lessons10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Denni on 16.08.2016.
 */
public class ListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 1, 2, 6, 4, 8, 2, 1, 3, 8));
        Collections.sort(list, (e1, e2) -> Integer.compare(e2,e1));
        System.out.println(list);

    }
}
