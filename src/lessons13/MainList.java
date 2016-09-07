package lessons13;

import lessons13.arrayList.ArrayList;

/**
 * Created by Denni on 07.09.2016.
 */
public class MainList {

    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList(15);
        System.out.println(list.size());
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList.size());
    }
}
