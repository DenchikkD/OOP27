package lessons8.dzLessons7_8;

/**
 * Created by Denni on 11.08.2016.
 */
public class MainFirma {
    public static void main(String[] args) {
        Firma firma = new Firma("Bud", "Baiker street,221B", 1_000_000);


        Employee employee1 = new Employee("Kondratuk", "Denis0", "Oleksandrovich", "man", 8900, 0, "Salers");
        Employee employee2 = new Employee("Kondratuk", "Denis1", "Oleksandrovich", "man", 8900, 0, "Salers");
        Seller employee3 = new Seller("Kondratuk", "Denis2", "Oleksandrovich", "man", 8900, 0, "0.5",150);
        Employee employee4 = new Employee("Kondratuk", "Denis4", "Oleksandrovich", "man", 8900, 0, "0.7");
        Employee employee5 = new Employee("Kondratuk", "Denis5", "Oleksandrovich", "man", 8900, 0, "0.7");
        Employee employee6 = new Employee("Kondratuk", "Denis6", "Oleksandrovich", "man", 8900, 0, "0.7");
        Employee employee7 = new Employee("Kondratuk", "Denis7", "Oleksandrovich", "man", 8900, 0, "0.33");
        Employee employee8 = new Employee("Kondratuk", "Denis8", "Oleksandrovich", "man", 8900, 0, "0.33");
        Employee employee9 = new Employee("Kondratuk", "Denis9", "Oleksandrovich", "man", 8900, 0, "0.33");
        Employee employee10 = new Employee("Kondratuk", "Denis10", "Oleksandrovich", "man", 8900, 0, "0.33");
        Employee employee11 = new Employee("Kondratuk", "Denis11", "Oleksandrovich", "man", 8900, 0, "0.5");
        Employee employee12 = new Employee("Kondratuk", "Denis12", "Oleksandrovich", "man", 8900, 0, "0.5");
        Employee employee13 = new Employee("Kondratuk", "Denis13", "Oleksandrovich", "man", 8900, 0, "0.5");
        Manager manager1 = new Manager("Kondratuk", "Denis01", "Oleksandrovich", "man", 8900, 0, "Salers", "0.33");
        Manager manager2 = new Manager("Kondratuk", "Denis01", "Oleksandrovich", "man", 8900, 0, "Salers", "0.5");
        Manager manager3 = new Manager("Kondratuk", "Denis01", "Oleksandrovich", "man", 8900, 0, "Salers", "0.7");
        Department department1 = new Department("0.5");
        Department department2 = new Department("0.33");
        Department department3 = new Department("0.7");
        firma.addEmployee(employee1);
        firma.addEmployee(employee2);
        firma.addEmployee(employee3);
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
        firma.addEmployeeInTheDepatrment(department1, employee3);
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
        System.out.println(firma.getEmployees());
        System.out.println(firma.getDepartments());
    }
}
