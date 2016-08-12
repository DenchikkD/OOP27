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
    private ArrayList<Employee> employeesOfDepartment;
    private Manager managerDepartment = null;

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        employeesOfDepartment = new ArrayList<>();
    }

    public void setManagerDepartment(Manager managerDepartment) {
        this.managerDepartment = managerDepartment;
    }

    public Manager getManagerDepartment() {
        return managerDepartment;
    }

    public ArrayList<Employee> getEmployeesOfDepartment() {
        return employeesOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartment='" + nameDepartment + '\'' +"\n"+
                ", employeesOfDepartment=" + employeesOfDepartment +
                ", managerDepartment=" + managerDepartment +
                '}' + "\n";
    }
}
