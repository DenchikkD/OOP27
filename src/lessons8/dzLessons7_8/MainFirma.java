package lessons8.dzLessons7_8;

import lessons8.dzLessons7_8.comparators.*;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.io.IOException;
import java.util.*;

/**
 * Created by Denni on 11.08.2016.
 */
public class MainFirma {
    public static void main(String[] args) throws IOException {
        Firma firma = new Firma("Bud", "Baiker street,221B", 210_000);


        Employee employee1 = new Employee("AKondratuk", "Denis10", "Oleksandrovich", "man", 8900, 0, "Salers");
        Employee employee2 = new Employee("BKondratuk", "Denis1", "Oleksandrovich", "man", 8900, 0, "Salers");
        Seller employee31 = new Seller("CAKondratuk", "Denis21", "Oleksandrovich", "man", 7900, 0, "0.5", 150);
        Seller employee32 = new Seller("CZKondratuk", "Denis22", "Oleksandrovich", "man", 8900, 0, "0.5", 160);
        Seller employee33 = new Seller("CBKondratuk", "Denis23", "Oleksandrovich", "man", 8900, 0, "0.5", 180);
        Employee employee4 = new Employee("DKondratuk", "Denis4", "Oleksandrovich", "man", 8700, 0, "0.7");
        Employee employee5 = new Employee("FKondratuk", "Denis5", "Oleksandrovich", "man", 8900, 0, "0.7");
        Employee employee6 = new Employee("GKondratuk", "ZDenis6", "Oleksandrovich", "man", 8900, 0, "0.7");
        Employee employee7 = new Employee("VKondratuk", "Denis7", "Oleksandrovich", "man", 9800, 0, "0.33");
        Employee employee8 = new Employee("XKondratuk", "Denis8", "Oleksandrovich", "man", 10900, 0, "0.33");
        Employee employee9 = new Employee("ZKondratuk", "FDenis9", "Oleksandrovich", "man", 8950, 0, "0.33");
        Employee employee10 = new Employee("EKondratuk", "Denis0", "Oleksandrovich", "man", 9900, 0, "0.33");
        Employee employee11 = new Employee("GKondratuk", "Denis11", "Oleksandrovich", "man", 6700, 0, "0.5");
        Employee employee12 = new Employee("Kondratuk", "ADenis12", "Oleksandrovich", "man", 8900, 0, "0.5");
        Employee employee13 = new Employee("Kondratuk", "BDenis13", "Oleksandrovich", "man", 8900, 0, "0.5");
        Manager manager1 = new Manager("Kondratuk", "ADenis01", "AOleksandrovich", "man", 18900, 0, "Salers", "0.5");
        Manager manager2 = new Manager("Kondratuk", "BDenis02", "VOleksandrovich", "man", 17900, 0, "Salers", "0.33");
        Manager manager3 = new Manager("Kondratuk", "CDenis03", "BOleksandrovich", "man", 19900, 0, "Salers", "0.7");
        Department department1 = new Department("0.5");
        manager1.setSubordinateDepartment(department1);
        Department department2 = new Department("0.33");
        manager2.setSubordinateDepartment(department2);
        Department department3 = new Department("0.7");
        manager3.setSubordinateDepartment(department3);
        firma.addEmployee(employee1);
        firma.addEmployee(employee2);
        firma.addEmployee(employee31);
        firma.addEmployee(employee32);
        firma.addEmployee(employee33);
        firma.addEmployee(employee4);
        firma.addEmployee(employee5);
        firma.addEmployee(employee6);
        firma.addEmployee(employee7);
        firma.addEmployee(employee8);
        firma.addEmployee(employee9);
        firma.addEmployee(employee10);
        firma.addEmployee(employee11);
        firma.addEmployee(employee12);
        firma.addEmployee(employee13);
        firma.addEmployee(manager1);
        firma.addEmployee(manager2);
        firma.addEmployee(manager3);
        firma.addEmployeeInTheDepatrment(department1, employee31);
        firma.addEmployeeInTheDepatrment(department1, employee32);
        firma.addEmployeeInTheDepatrment(department1, employee33);
        firma.addEmployeeInTheDepatrment(department1, employee11);
        firma.addEmployeeInTheDepatrment(department1, employee12);
        firma.addEmployeeInTheDepatrment(department1, employee13);
        firma.addEmployeeInTheDepatrment(department2, employee7);
        firma.addEmployeeInTheDepatrment(department2, employee8);
        firma.addEmployeeInTheDepatrment(department2, employee9);
        firma.addEmployeeInTheDepatrment(department2, employee10);
        firma.addEmployeeInTheDepatrment(department3, employee4);
        firma.addEmployeeInTheDepatrment(department3, employee5);
        firma.addEmployeeInTheDepatrment(department3, employee6);

        department1.setManagerDepartment(manager2);
        department2.setManagerDepartment(manager1);
        department3.setManagerDepartment(manager3);
        firma.getDepartments().add(department1);
        firma.getDepartments().add(department2);
        firma.getDepartments().add(department3);
//        System.out.println(firma.getAllEmployees());
//        System.out.println(firma.getDepartments());
//        System.out.println(firma.fireEmployee("Denis10", "Kondratuk", "Oleksandrovich"));
//        System.out.println(firma.getAllEmployeesSortedBySalary());

//        System.out.println(firma.getAllEmployeesSortedBySName());
//        System.out.println(firma.getEmployeesFromDep("0.33"));
//        System.out.println(firma.getEmployeesFromDepSortedBySalary("0.33"));
//        System.out.println(firma.getEmployeesFromDepSortedBySName("0.33"));
//        System.out.println(firma.getAllEmployees());
//        firma.sellFor10();
//        System.out.println(firma.getAllEmployees());
//        firma.giveSalaryForAll();
//        System.out.println(firma.getAllEmployees());
//        System.out.println(firma.getBankAccoutOfTheFirm());
//        System.out.println(firma.getAllEmployees());
//        System.out.println(firma.addANewEmployeeInTheDepartment(new Employee("Vova","Vova","Vova","man",5000,0,"0.555")));
//        System.out.println(firma.getAllEmployees());
//        System.out.println(firma);
//        SaveFirma.saveFirma("D:\\progects/gitTest/OOP27/FileDirectory/saveFirma.txt",firma);

//        System.out.println(new Date(System.currentTimeMillis()));
        DepartmentComparator departmentComparator = new DepartmentComparator();

        firma.getComparatorsList().add(departmentComparator);
        firma.getComparatorsList().add(new MiddlenameComparator());
        firma.getComparatorsList().add(new NameComparator());
        firma.getComparatorsList().add(new SaleryComparator());
        firma.getComparatorsList().add(new SexComparator());
        firma.getComparatorsList().add(new SurNameComparator());
        firma.getComparatorsList().add(new FooComparator());
        System.out.println(firma.getAllEmployees());
        Collections.sort(firma.getAllEmployees(),firma.changeComparator(new LinkedList<Comparator<Employee>>(firma.getComparatorsList())));
        System.out.println(firma.getAllEmployees());

//        ConsolMenu consolMenu = new ConsolMenu(firma);
//        consolMenu.start();

    }
}
