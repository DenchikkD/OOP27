package lessons8.dzLessons7_8;

import java.util.ArrayList;

/**
 * Created by Denni on 11.08.2016.
 * * - добавить сотрудника на фирму (метод boolean addEmployee(Employee employee))
 * - уволить сотрудника по ФИО, (метод boolean fireEmployee(String name, String surname, String patronymic))
 * - перевести сотрудника в отдел (метод boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName))
 * -------------------------------------------------------
 * - получить список всех сотрудников (метод ArrayList<Employee> пуеAllEmployees())
 * - получить список всех сотрудников, отсортированных по зп (метод ArrayList<Employee> getAllEmployeesSortedBySalary())
 * - получить список всех сотрудников, отсортированных по фамилии (метод ArrayList<Employee> getAllEmployeesSortedBySName())
 * -------------------------------------------------------
 * - получить список всех сотрудников в указанном отделе (метод ArrayList<Employee> getEmployeesFromDep(String departmentName))
 * - получить список всех сотрудников в указанном отделе, отсортированных по зп
 * (метод ArrayList<Employee> getEmployeesFromDepSortedBySalary(String departmentName))
 * - получить список всех сотрудников в указанном отделе, отсортированных по фамилии
 * (метод ArrayList<Employee> getEmployeesFromDepSortedBySName(String departmentName))
 * -------------------------------------------------------
 * - всем продавцам продать на сумму 10000, (метод void sellFor10())
 * - Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника с главного счета фирмы, если на счету фирмы не хватает средств - выдать сколько хватит =)) (метод void giveSalaryForAll())
 * -------------------------------------------------------
 * -* нанять сотрудника, снять с зарплаты сотрудников отдела зарплату для новичка
 * -* после любой изменяющей операции сохранять фирму в файл
 * -------------------------------------------------------
 * Написать консольное меню для управления фирмой, пункты меню соответствует функционалу самой фирмы.
 * * класс фирма (Firm), содержащий имя, адрес, главный счет (сумма), список отрудников, список отделов.
 */
public class Firma {
    private String nameFirma;
    private String address;
    private float BankAccoutOfTheFirm;
    private ArrayList<Employee> employees;
    private ArrayList<Department> departments;

    public Firma(String nameFirma, String address, float bankAccoutOfTheFirm) {
        this.nameFirma = nameFirma;
        this.address = address;
        this.BankAccoutOfTheFirm = bankAccoutOfTheFirm;
        employees = new ArrayList<>();
        departments = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public boolean addEmployee(Employee employee) {
        if (employees.size() > 0) {
//            if (!employees.contains(employee)) {
//                employees.add(employee);
            for (int i = 0; i < employees.size(); i++) {
//                if (employees.get(i).equals(employee))
                if (employees.get(i).getName().equalsIgnoreCase(employee.getName()) &&
                        employees.get(i).getSurname().equalsIgnoreCase(employee.getSurname()) &&
                        employees.get(i).getMiddlename().equalsIgnoreCase(employee.getMiddlename())) {
//                    System.out.println(employee.getName());
                    return false;
                }
            }
        }
        employees.add(employee);
        return true;
    }

    public boolean addEmployeeInTheDepatrment(Department department, Employee employee) {
        if (department.getEmployeesOfDepartment().size() > 0) {
            for (int i = 0; i < department.getEmployeesOfDepartment().size(); i++) {
                if (department.getEmployeesOfDepartment().get(i).getName().equalsIgnoreCase(employee.getName()) &&
                        department.getEmployeesOfDepartment().get(i).getSurname().equalsIgnoreCase(employee.getSurname()) &&
                        department.getEmployeesOfDepartment().get(i).getMiddlename().equalsIgnoreCase(employee.getMiddlename())) {
                    return false;
                }
            }

        }
        department.getEmployeesOfDepartment().add(employee);
        return true;
    }

    public boolean fireEmployee(String name, String surname, String patronymic) {
        if (employees.size() > 0) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getName().equalsIgnoreCase(name) &&
                        employees.get(i).getSurname().equalsIgnoreCase(surname) &&
                        employees.get(i).getMiddlename().equalsIgnoreCase(patronymic)) {
                    for (int j = 0; j < departments.size() && departments.size() > 0; j++) {
                        if (departments.get(j).getNameDepartment().equalsIgnoreCase(employees.get(i).getDepartment())) {
                            for (int k = 0; k < departments.get(j).getEmployeesOfDepartment().size(); k++) {
                                if (departments.get(j).getEmployeesOfDepartment().get(k).getName().equalsIgnoreCase(name) &&
                                        departments.get(j).getEmployeesOfDepartment().get(k).getSurname().equalsIgnoreCase(surname) &&
                                        departments.get(j).getEmployeesOfDepartment().get(k).getMiddlename().equalsIgnoreCase(patronymic)) {
                                    departments.get(j).getEmployeesOfDepartment().remove(k);
                                }
                            }
                        }
                    }
                    System.out.println("чувак уволен" + employees.get(i).toString());
                    employees.remove(i);
                    return true;
                }
            }
        }
        return false;
    }


}