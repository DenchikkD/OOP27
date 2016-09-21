package hashSet;

import java.util.HashSet;

/**
 * Created by Iliren on 21.09.2016.
 */
public class HashSetMain {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(null));
        System.out.println(hashSet.add(null));

        MyHashSet<Integer> myHashSet = new MyHashSet<>();
        myHashSet.add(5);
        myHashSet.add(6);
        myHashSet.add(2);
        myHashSet.add(33);
        myHashSet.add(43);
        myHashSet.add(35);
        myHashSet.add(73);
        myHashSet.add(5);
        System.out.println(myHashSet.size());
        System.out.println(myHashSet);

    }
}
