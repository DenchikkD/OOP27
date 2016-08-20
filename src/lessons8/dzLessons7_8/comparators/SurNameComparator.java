package lessons8.dzLessons7_8.comparators;

import lessons8.dzLessons7_8.Employee;

import java.util.Comparator;

/**
 * Created by Iliren on 20.08.2016.
 */
public class SurNameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSurname().compareToIgnoreCase(o2.getSurname());
    }

    @Override
    public String toString() {
        return "відсортувати список за прізвищем";
    }
}
