package lessons3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Denni on 18.07.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {68, 48, 50, 60, 20, 0, 41, 51, 28, 78};
//        bibbleSort(array);
//        selection(array);
//        selection(array);
        System.out.println(Arrays.toString(array));
//        chetNechet(array);
//        combosort(array);
        shell(array);
//        insertion(array);
        System.out.println(Arrays.toString(array));


//        shaker(array);

    }

    public static void bibbleSort(int[] array) {
        boolean hasChange = true;

        for (int i = 0; hasChange; i++) {
            hasChange = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
//                    int tmp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = tmp;
                    hasChange = true;
                }
            }


            System.out.println(Arrays.toString(array));
        }
    }

    public static void selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minIdx = j;
                }
            }
            swap(array, i, minIdx);
//           int tmp = array[i];
//            array[i] = array[minIdx];
//            array[minIdx] = tmp;

            System.out.println(Arrays.toString(array));
        }
    }

    public static void insertion(int[] array) {


        for (int i = 1; i < array.length; i++) {

            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                swap(array, j - 1, j);
            }
        }
    }


    public static void shaker(int[] array) {
        int start = 0;
        int count = 0;
        int end = array.length - 1;
        for (int i = start; i < end; i++) {
            count++;
            if (array[i] > array[i + 1]) {
                swap(array, i + 1, i);
                count++;
            }
            if (i == end - 1) {
                end--;
                for (int j = i; j > start; j--) {
                    count++;
                    if (array[j] < array[j - 1]) {
                        count++;
                        swap(array, j - 1, j);
                    }

                }
                start++;
                i = start;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(array));
    }


    public static void chetNechet(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i % 2; j < array.length - 1; j += 2) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void combosort(int[] array) {
        int step = ((array.length % 2) == 0) ? (array.length / 2) : (array.length / 2 + 1); // тернарний оператор
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j + step < array.length; j++) {
                if (array[j] > array[j + step]) {
                    swap(array, j, j + step);
                }
            }
            if (step > 1) {
                step = step / 2;
            }
        }
    }

    public static void shell(int[] array) {
//        int step = ((array.length % 2) == 0) ? (array.length / 2) : (array.length / 2 + 1);
int step = array.length/2;
        for (int i = step; i > 0; i /= 2) {
            for (int j = 0; j + step < array.length; j++) {
                if (array[j] > array[j + step]) {
                    swap(array, j, j + step);
                    boolean cange = true;
                    int k = j;
                    while (cange && k - step >= 0) {
                        if (array[k - step] > array[k]) {
                            swap(array, k - step, k);
                            k -= step;
                        }
                        cange = false;
                    }
                }
            }
            if (step > 1) {
                step = step / 2;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }

}
