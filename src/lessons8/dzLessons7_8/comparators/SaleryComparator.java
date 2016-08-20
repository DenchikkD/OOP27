package lessons8.dzLessons7_8.comparators;

import lessons8.dzLessons7_8.Employee;

import java.util.Comparator;

/**
 * Created by Denni on 14.08.2016.
 */
public class SaleryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Float.compare(o1.getSalary(), o2.getSalary());
    }
}
