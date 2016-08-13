package lessons8.dzLessons7_8;

/**
 * Created by Denni on 11.08.2016.
 * класс фирма (Firm), содержащий имя, адрес, главный счет (сумма), список отрудников, список отделов.
 * <p>
 * На фирме должны работать следующие сотрудники:
 * Employee, Manager, SalesManager
 * <p>
 * Обычный сотрудник:
 * - Фамилия
 * - Имя
 * - Отчество
 * - Пол
 * - Ставка зарплаты
 * - Зарплатный счет
 * - Отдел
 * <p>
 * Менеджер:
 * все что и у обычного +
 * - подчиненный отдел
 * <p>
 * (зп считается - ставка + по 50 за подчиненного)
 * <p>
 * Продавец :
 * все что и у обычного +
 * - продажи
 * (зп считается - ставка + 30% от продаж)
 * <p>
 * Отдел :(Класс Department)
 * - Название отдела
 * - Список сотрудников в отделе
 * - Менеджер отдела
 * <p>
 * Фирма:
 * - добавить сотрудника на фирму (метод boolean addEmployee(Employee employee))
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
 */

// Обычный сотрудник:
//         - Фамилия
//        - Имя
//        - Отчество
//        - Пол
//        - Ставка зарплаты
//        - Зарплатный счет
//        - Отдел
public class Employee {

    private String surname;
    private String name;
    private String middlename;
    private String sex;
    private float salary;
    private float bankAccount;
    private String department;

    public Employee(String surname, String name, String middlename, String sex, float salary, float bankAccount, String department) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.sex = sex;
        this.salary = salary;
        this.bankAccount = bankAccount;
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o.getClass() != Employee.class)) return false;

        Employee employee = (Employee) o;

        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return middlename != null ? middlename.equals(employee.middlename) : employee.middlename == null;

    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (middlename != null ? middlename.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                " surname= '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", middlename = '" + middlename + '\'' +
                ", sex = '" + sex + '\'' +
                ", salary = " + salary +
                ", bankAccount = " + bankAccount +
                ", department = '" + department + '\'' +
                '}'+"\n";
    }
}
