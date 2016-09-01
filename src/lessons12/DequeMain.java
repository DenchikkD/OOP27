package lessons12;

/**
 * Created by Denni on 01.09.2016.
 */
public class DequeMain {
    public static void main(String[] args) {
        LinkedDeque linkedDeque = new LinkedDeque();


        System.out.println(linkedDeque.pushFirst(11));
        System.out.println(linkedDeque.pushFirst(15));
        System.out.println(linkedDeque.ptakeFirst());
        System.out.println(linkedDeque.size());
        System.out.println(linkedDeque.popFirst());
        System.out.println(linkedDeque.ptakeFirst());
        System.out.println(linkedDeque.size());
        System.out.println(linkedDeque.popFirst());
    }
}
