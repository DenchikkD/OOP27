package lessons8.dzLessons7_8;

import java.util.Comparator;

/**
 * Created by Denni on 14.08.2016.
 */
public class SaleryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
