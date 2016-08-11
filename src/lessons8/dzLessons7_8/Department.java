package lessons8.dzLessons7_8;

import java.util.ArrayList;

/**
 * Created by Denni on 11.08.2016.
 * * Отдел :(Класс Department)
 * - Название отдела
 * - Список сотрудников в отделе
 * - Менеджер отдела
 * <p>
 */
public class Department {
    private String nameDepartment;
    private ArrayList<Employee> employees;
    private Manager managerDepartment;

    public Department(String nameDepartment, ArrayList<Employee> employees, Manager managerDepartment) {
        this.nameDepartment = nameDepartment;
        this.employees = employees;
        this.managerDepartment = managerDepartment;
    }

    public void setManagerDepartment(Manager managerDepartment) {
        this.managerDepartment = managerDepartment;
    }
}
