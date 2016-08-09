package lessons4;

/**
 * Created by Denni on 19.07.2016.
 */
public class Task1 {
    public static void main(String[] args) {
//        f(0, 20);
        System.out.println(sum(1,3));
    }

    public static void f(int count, int size) {
        System.out.println(count);
        if (count == size) {
            return;
        }
        f(count + 1, size);
        System.out.println(count);

    }

    public static int sum(int start, int end) {
        if (start == end) {
            return end;
        }
//        int result = sum(start + 1, end);
//        int res = start + result;
//        return res;
        return start+sum(start+1,end);
    }

}
