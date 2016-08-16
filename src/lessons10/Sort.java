package lessons10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Denni on 16.08.2016.
 */
public class Sort {
    public static void main(String[] args) {
        Integer[] arr = {50, 4, 5, 8, 7, 1, 8, 7, 1, 2, 5, 4, 6};
        String[] str = {"a", "b", "v", "h", "z", "x", "r", "s",};

        Arrays.sort(str, new CompareSTR());
        Arrays.sort(str, (String s1, String s2) -> {
            return -s1.compareTo(s2);
        });

        Arrays.sort(str, (s1, s2) -> s1.compareToIgnoreCase(s2));

        Arrays.sort(arr, new CompareDESC());
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}

class CompareDESC implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        }
        return 0;
    }
}

class CompareSTR implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);

    }
}
