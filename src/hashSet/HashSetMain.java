package hashSet;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.HashSet;

/**
 * Created by Iliren on 21.09.2016.
 */
public class HashSetMain {
    public static void main(String[] args) {

//        HashSet<Integer> hashSet = new HashSet<>();
//
//        System.out.println(hashSet.add(null));
//        System.out.println(hashSet.add(null));
//        System.out.println(hashSet);
//        for (Integer i:hashSet
//             ) {
//            System.out.println(i);
//
//        }
//        Integer a=null;
//        Integer b=null;
//        System.out.println(a.equals(b));
//        System.out.println(a.hashCode()%16);

        MyHashSet<Integer> myHashSet = new MyHashSet<>();
        System.out.println(myHashSet.size());
        for (int i = 0; i < 50; i++) {
//            System.out.println(i);
            Integer a =(int) (Math.random() * 50000);
//            System.out.println(a);
            System.out.println(myHashSet.add(a));
        }
        System.out.println(myHashSet);
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.size());

//        System.out.println(myHashSet.add(null));
//        System.out.println(myHashSet.add(5));
//        System.out.println(myHashSet.add(96));
//        System.out.println(myHashSet.add(112));
//        System.out.println(myHashSet.add(112));
//        System.out.println(myHashSet.add(128));
//
//        System.out.println(myHashSet.add(null));
//        System.out.println(myHashSet.add(54));
//        System.out.println(myHashSet.add(52));
//
//        System.out.println(myHashSet.add(50));
//        System.out.println(myHashSet.add(5));
//
//        System.out.println(myHashSet.size());
//        System.out.println(myHashSet);
//        System.out.println(myHashSet.contains(1));

    }
}
