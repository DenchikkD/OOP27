package lessons8.dzLessons7_8.comparators;

import lessons8.dzLessons7_8.Employee;

import java.util.Comparator;

/**
 * Created by Denni on 20.08.2016.
 */
public class DepartmentComparator implements Comparator<Employee> {
//    private String nameComparator;

    public DepartmentComparator() {

    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().compareToIgnoreCase(o2.getDepartment());
    }

    @Override
    public String toString() {
        return "відсортувати список за відділом";
    }

}
