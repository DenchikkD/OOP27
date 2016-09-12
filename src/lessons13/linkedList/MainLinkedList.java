package lessons13.linkedList;

/**
 * Created by Denni on 12.09.2016.
 */
public class MainLinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> linkedList1 = new java.util.LinkedList<>();
        linkedList1.add(5);
        linkedList1.add(5);
        linkedList1.add(null);
        linkedList1.add(null);
        System.out.println(linkedList1);
        for (Integer s: linkedList1){
            System.out.println(s+" ");
        }


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("5");
        linkedList.add(0, "6");
        linkedList.add(2, "7");
        linkedList.add(2, "17");
        linkedList.add(2, "17");
        linkedList.add(null);
        linkedList.add(null);
//        System.out.println(linkedList.size());
//        System.out.println(linkedList);
//        System.out.println(linkedList.get(3));
//        System.out.println(linkedList.set(1, "15"));
//        System.out.println(linkedList);
//        System.out.println(linkedList.remove(4));

//        System.out.println(linkedList.size());
//        System.out.println(linkedList);
        System.out.println(linkedList.reduce((o1,o2)->(o1+o2),""));
        for (String s: linkedList){
            System.out.print(s+" ");
        }


    }
}
