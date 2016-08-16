package lessons10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Denni on 16.08.2016.
 */
public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> listPersons = new ArrayList<>();
        listPersons.add(new Person("Vacia", "Pavlov", 19));
        listPersons.add(new Person("Vova", "Petrov", 29));
        listPersons.add(new Person("Vlad", "Bovrov", 29));
        listPersons.add(new Person("Den", "Popov", 18));
        listPersons.add(new Person("Viktor", "Gai", 12));
        listPersons.add(new Person("Valera", "Dai", 23));

//        Collections.sort(listPersons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if (o1.age > o2.age) {
//                    return 1;
//                } else if (o1.age < o2.age) {
//                    return -1;
//                } else {
//                    return o1.name.compareToIgnoreCase(o2.name);
//                }
//            }
//        });
        //_______________________________________________________________
//        Collections.sort(listPersons, (p1, p2) -> {
//            if (p1.age != p2.age) {
//                return Integer.compare(p1.age, p2.age);
//            } else {
//                return p1.name.compareToIgnoreCase(p2.name);
//            }
//
//        });


        Collections.sort(listPersons, Person.BY_AGE.thenComparing(Person.BY_Name));
        System.out.println(listPersons);
    }

//    public static Comparator<Person> takeComparator() {
//        if () {
//
//        } else
//            return Person.BY_AGE.thenComparing(takeComparator());
//    }

}
