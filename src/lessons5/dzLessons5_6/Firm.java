package lessons5.dzLessons5_6;

import java.util.ArrayList;

/**
 * Created by Denni on 08.08.2016.
 */
public class Firm {

    String nameFirm;
    int bankAccountOfFirm;
    ArrayList<Employee> employees;

    public Firm(String nameFirm, int bankAccountOfFirm) {
        this.nameFirm = nameFirm;
        this.bankAccountOfFirm = bankAccountOfFirm;
        employees = new ArrayList<>();

    }

    public boolean addEmployee(String name, String sName, int prixe, int bankAccount, String sex, String department) {

        Employee employee = new Employee(name, sName, prixe, bankAccount, sex, department);
        employees.add(employee);
        return true;
    }

    boolean fireEmployee(String name, String surname) {

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).name.equalsIgnoreCase(name) && employees.get(i).sName.equalsIgnoreCase(surname)) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

    ArrayList<Employee> getAllEmployees() {
        return new ArrayList<Employee>(employees);
    }
}
