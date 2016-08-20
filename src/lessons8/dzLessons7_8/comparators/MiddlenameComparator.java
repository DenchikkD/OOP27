package lessons8.dzLessons7_8.comparators;

import lessons8.dzLessons7_8.Employee;

import java.util.Comparator;

/**
 * Created by Iliren on 20.08.2016.
 */
public class MiddlenameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getMiddlename().compareToIgnoreCase(o2.getMiddlename());
    }
}
