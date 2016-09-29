package hashMap;

import java.util.HashMap;

/**
 * Created by Iliren on 29.09.2016.
 */
public class MyHashMapMain {
    public static void main(String[] args) {
        HashMap map = new HashMap();


        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

            myHashMap.put("vova",5);
            myHashMap.put("vov",15);
            myHashMap.put("vasia",45);
            myHashMap.put("vadiy",54);



        System.out.println(myHashMap);
    }
}
