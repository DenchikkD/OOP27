package lessoms11.homeWork;

/**
 * Created by Iliren on 01.09.2016.
 */
public class MainCollections {
    public static void main(String[] args) {
        ClassStackList stackList = new ClassStackList();
        System.out.println(stackList.isEmpty());
        System.out.println(stackList.push(2));
        System.out.println(stackList.isEmpty());
        System.out.println(stackList.push(12));
        System.out.println(stackList.push(22));
        System.out.println(stackList.push(23));
        System.out.println(stackList.take());
        System.out.println(stackList.take());
        System.out.println(stackList.pop());
        System.out.println(stackList.size());

        System.out.println(stackList.take());
        System.out.println(stackList.pop());
        System.out.println(stackList.size());

        System.out.println(stackList.take());
        System.out.println(stackList.pop());
        System.out.println(stackList.size());

        System.out.println(stackList.take());
        System.out.println(stackList.pop());
        System.out.println(stackList.size());

        System.out.println(stackList.take());
        System.out.println(stackList.pop());
        System.out.println(stackList.size());

    }

}
