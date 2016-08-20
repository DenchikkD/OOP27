package lessons8.dzLessons7_8.comparators;

import lessons8.dzLessons7_8.Employee;

import java.util.Comparator;

/**
 * Created by Denni on 14.08.2016.
 */
public class NameComparator implements Comparator<Employee> {


    @Override
    public String toString() {
        return "відсортувати список за іменем";
    }

    @Override
    public int compare(Employee o1, Employee o2) {
//        if ((o1.getSurname().compareToIgnoreCase(o2.getSurname())) > 0) {
//            return 1;
//        } else if ((o1.getSurname().compareToIgnoreCase(o2.getSurname())) < 0) {
//            return -1;
//        } else {
//            if ((o1.getName().compareToIgnoreCase(o2.getName())) > 0) {
//                return 1;
//            } else if ((o1.getName().compareToIgnoreCase(o2.getName())) < 0) {
//                return -1;
//            } else {
//                if ((o1.getMiddlename().compareToIgnoreCase(o2.getMiddlename())) > 0) {
//                    return 1;
//                } else if ((o1.getMiddlename().compareToIgnoreCase(o2.getMiddlename())) < 0) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        }
        return o1.getName().compareToIgnoreCase(o2.getName());

    }

}
