package lessoms11.homeWork;

import java.util.function.Consumer;

/**
 * Created by Denni on 22.08.2016.
 */
public class Links {
    public static void main(String[] args) {
        Node nl = new Node(19);
        Node n2 = new Node(9);
        Node n3 = new Node(1);
        Node n4 = new Node(12);

        nl.next = n2;
        n2.next = n3;
        n3.next = n4;
        prinIter(nl);

        process(nl, (node -> System.out.print(node.value + " ")));
    }

    public static void prinIter(Node first) {
        Node tmp = first;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }

    }

    public static void process(Node first, Consumer<Node> cons) {

        while (first != null) {
            cons.accept(first);
            first = first.next;
        }

    }
}
