package lessons12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.function.Function;

/**
 * Created by Denni on 01.09.2016.
 */
public class DequeMain {
    static FunctionD functionD = new FunctionD();

    public static void main(String[] args) {
        LinkedDeque<Integer> linkedDeque = new LinkedDeque();


        System.out.println(linkedDeque.pushFirst(11));
        System.out.println(linkedDeque.pushFirst(15));
//        System.out.println(linkedDeque.ptakeFirst());
//        System.out.println(linkedDeque.size());
//        System.out.println(linkedDeque.popFirst());
//        System.out.println(linkedDeque.ptakeFirst());
        System.out.println(linkedDeque.size());
//        System.out.println(linkedDeque.popFirst());
        System.out.println(linkedDeque);

//
//        linkedDeque.forEachLast((e) -> System.out.print(e + " "));
        linkedDeque.forEachLast(System.out::print);
        linkedDeque.map((e) -> (e + 5));
//        linkedDeque.map(new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer + 10;
//            }
//        });
//        linkedDeque.map(functionD);
        System.out.println(linkedDeque);


    }
}
