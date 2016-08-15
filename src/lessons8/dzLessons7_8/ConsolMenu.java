package lessons8.dzLessons7_8;

import java.io.IOException;
import java.util.Scanner;

//
//* - добавить сотрудника на фирму (метод boolean addEmployee(Employee employee))
//        * - уволить сотрудника по ФИО, (метод boolean fireEmployee(String name, String surname, String patronymic))
//        * - перевести сотрудника в отдел (метод boolean setDepartmentForEmployee(String name, String surname, String patronymic, String departmentName))
//        * -------------------------------------------------------
//        * - получить список всех сотрудников (метод ArrayList<Employee> пуеAllEmployees())
//        * - получить список всех сотрудников, отсортированных по зп (метод ArrayList<Employee> getAllEmployeesSortedBySalary())
//        * - получить список всех сотрудников, отсортированных по фамилии (метод ArrayList<Employee> getAllEmployeesSortedBySName())
//        * -------------------------------------------------------
//        * - получить список всех сотрудников в указанном отделе (метод ArrayList<Employee> getEmployeesFromDep(String departmentName))
//        * - получить список всех сотрудников в указанном отделе, отсортированных по зп
//        * (метод ArrayList<Employee> getEmployeesFromDepSortedBySalary(String departmentName))
//        * - получить список всех сотрудников в указанном отделе, отсортированных по фамилии
//        * (метод ArrayList<Employee> getEmployeesFromDepSortedBySName(String departmentName))
//        * -------------------------------------------------------
//        * - всем продавцам продать на сумму 10000, (метод void sellFor10())
//        * - Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника,
// сумму равную зарплате сотрудника с главного счета фирмы, если на счету фирмы не хватает средств - выдать сколько хватит =)) (метод void giveSalaryForAll())
//        * -------------------------------------------------------
//        * -* нанять сотрудника, снять с зарплаты сотрудников отдела зарплату для новичка
//        * -* после любой изменяющей операции сохранять фирму в файл
//        *

/**
 * Created by Denni on 15.08.2016.
 */
public class ConsolMenu {
    private Firma firma;

    public ConsolMenu(Firma firma) {
        this.firma = firma;
    }

    public void start() throws IOException {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);


        while (check) {
            System.out.println("Привет , это консольное меню фирмы , выберите действие:");
            System.out.println("1  - добавить сотрудника на фирму");
            System.out.println("2  - перевести сотрудника в отдел");
            System.out.println("3  - получить список всех сотрудников");
            System.out.println("4  - получить список всех сотрудников, отсортированных по зп");
            System.out.println("5  - получить список всех сотрудников, отсортированных по фамилии");
            System.out.println("6  - получить список всех сотрудников в указанном отделе");
            System.out.println("7  - получить список всех сотрудников в указанном отделе, отсортированных по зп");
            System.out.println("8  - получить список всех сотрудников в указанном отделе, отсортированных по фамилии");
            System.out.println("9  - всем продавцам продать на сумму 10000");
            System.out.println("10  - Выдать всем сотрудникам зарплату");
            System.out.println("11  - нанять сотрудника, снять с зарплаты сотрудников отдела зарплату для новичка");
            System.out.println("12  - уволить сотрудника по ФИО");
            System.out.println("13  - сохранить состояние фирми");
            System.out.println("14  - выход из консольного меню");

            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    // Обычный сотрудник:
//         - Фамилия
//        - Имя
//        - Отчество
//        - Пол
//        - Ставка зарплаты
//        - Зарплатный счет
//        - Отдел
                    System.out.println("Введите фамилию сотрудника");
                    String sName = scanner.next();
                    System.out.println("Введите имя сотрудника");
                    String name = scanner.next();
                    System.out.println("Введите отчество сотрудника");
                    String middlename = scanner.next();
                    System.out.println("Введите пол сотрудника");
                    String sex = scanner.next();
                    System.out.println("Введите ставку зарплаты сотрудника");
                    float salary = scanner.nextFloat();
                    System.out.println("Введите зарплатный счет сотрудника");
                    float bankAccount = scanner.nextFloat();
                    System.out.println("Введите отдел сотрудника");
                    String department = scanner.next();
                    if (firma.addEmployee(new Employee(sName, name, middlename, sex, salary, bankAccount, department))) {
                        System.out.println("Вы добавили  нового сотрудника");
                    } else {
                        System.out.println("Не получилось");
                    }

                    break;
                case 2:
                    System.out.println("Введите фамилию сотрудника");
                    String sNameToDep = scanner.nextLine();
                    System.out.println("Введите имя сотрудника");
                    String nameToDep = scanner.nextLine();
                    System.out.println("Введите отчество сотрудника");
                    String middlenameToDep = scanner.nextLine();
                    System.out.println("Введите отдел сотрудника");
                    String newDdepartment = scanner.nextLine();
                    if (firma.setDepartmentForEmployee(nameToDep, sNameToDep, middlenameToDep, newDdepartment)) {
                        System.out.println("Вы перевели сотрудника в другой отдел");
                    } else {
                        System.out.println("Не получилось");
                    }
                case 3:
                    System.out.println(firma.getAllEmployees());
                case 4:
                    System.out.println(firma.getAllEmployeesSortedBySalary());
                case 5:
                    System.out.println(firma.getAllEmployeesSortedBySName());
                case 6:
                    System.out.println("Введите название отдела");
                    String nameDep = scanner.nextLine();
                    System.out.println(firma.getEmployeesFromDep(nameDep));
                case 7:
                    System.out.println("Введите название отдела");
                    String nameDep1 = scanner.nextLine();
                    System.out.println(firma.getEmployeesFromDepSortedBySalary(nameDep1));
                case 8:
                    System.out.println("Введите название отдела");
                    String nameDep2 = scanner.nextLine();
                    System.out.println(firma.getEmployeesFromDepSortedBySName(nameDep2));
                case 9:
                    firma.sellFor10();
                case 10:
                    firma.giveSalaryForAll();
                case 11:
                    System.out.println("Введите фамилию сотрудника");
                    String newsNameToDep = scanner.nextLine();
                    System.out.println("Введите имя сотрудника");
                    String newnameToDep = scanner.nextLine();
                    System.out.println("Введите отчество сотрудника");
                    String newmiddlenameToDep = scanner.nextLine();
                    System.out.println("Введите пол сотрудника");
                    String newsex = scanner.nextLine();
                    System.out.println("Введите ставку зарплаты сотрудника");
                    float newsalary = scanner.nextFloat();
                    System.out.println("Введите зарплатный счет сотрудника");
                    float newbankAccount = scanner.nextFloat();
                    System.out.println("Введите отдел сотрудника");
                    String newEmpToDdepartment = scanner.nextLine();
                    if (firma.addANewEmployeeInTheDepartment(new Employee(newsNameToDep, newnameToDep, newmiddlenameToDep, newsex, newsalary, newbankAccount, newEmpToDdepartment))) {
                        System.out.println("Вы наняли нового сторудника в указаый отдел");
                    } else {
                        System.out.println("Не получилось");
                    }
                case 12:
                    System.out.println("Введите фамилию сотрудника");
                    String fireSName = scanner.nextLine();
                    System.out.println("Введите имя сотрудника");
                    String fireName = scanner.nextLine();
                    System.out.println("Введите отчество сотрудника");
                    String fireMiddlename = scanner.nextLine();
                    if (firma.fireEmployee(fireName, fireSName, fireMiddlename)) {
                        System.out.println("Вы уволили сотрудника");
                    } else {
                        System.out.println("Не получилось!");
                    }
                case 13:
                    SaveFirma.saveFirma("D:\\progects/gitTest/OOP27/FileDirectory/saveFirma.txt", firma);
                case 14:
                    System.out.println("Пака - пака!");
                    check = false;
            }

        }

    }
}
