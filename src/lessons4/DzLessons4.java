package lessons4;

import java.util.Arrays;

/**
 * Created by Denni on 22.07.2016.
 */
public class DzLessons4 {
    public static void main(String[] args) {
        System.out.println(factorial(64));
        System.out.println(pow(5, 2));
        System.out.println(sum(12345));
        System.out.println(fib(64));
        revers(12023);
        System.out.println();
        int[] arr = {1, 2, 3};
        permute(arr, 0);

    }


    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int pow(int n, int m) {
        if (m == 0) {
            return 1;
        }
        return n * pow(n, m - 1);
    }

    public static int sum(int num) {
        return num==0?0:sum(num/10)+(num%10);
//        if (num < 10) {
//            return num;
//        }
//        return sum(num / 10) + (num % 10);
    }

    public static int fib(int val) {
//        System.out.println(val);
        if (val == 0) {
            return val;
        } else if (val == 1) {
            return val;
        }
        return fib(val - 1) + fib(val - 2);
    }
    public static void revers(int num){
        System.out.print(num%10);
        if(num/10==0){
            return;

        }
        revers(num/10);
    }

    public static void permute(int[] array, int idx) {

        if (idx >= array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i = idx; i < array.length; i++) {
            swap(array,idx,i);
           permute(array,idx+1);
            swap(array,idx,i);
        }

    }

    public static void swap(int[] array, int i, int j) {

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }
}
