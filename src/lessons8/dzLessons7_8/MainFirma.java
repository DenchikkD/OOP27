package lessons8.dzLessons7_8;

/**
 * Created by Denni on 11.08.2016.
 */
public class MainFirma {
    public static void main(String[] args) {
        Firma firma = new Firma("Bud", "Baiker street,221B", 1_000_000);
//        firma.getDepartments().add();
        Department department = new Department("Managers", firma.getEmployees(), null);


        System.out.println(firma.addEmployee(new Employee("Kondratuk", "Denis0", "Oleksandrovich", "man", 8900, 0, "Salers")));
        System.out.println(firma.addEmployee(new Employee("Kondratuk", "Denis1", "Oleksandrovich", "man", 8900, 0, "Salers")));
        System.out.println(firma.addEmployee(new Employee("Kondratuk", "Denis2", "Oleksandrovich", "man", 8900, 0, "Salers")));
        System.out.println(firma.addEmployee(new Employee("Kondratuk", "Denis4", "Oleksandrovich", "man", 8900, 0, "Salers")));
        System.out.println(firma.addEmployee(new Employee("Kondratuk", "Denis4", "Oleksandrovich", "man", 8900, 0, "Salers")));
        System.out.println(firma.addEmployee(new Employee("Kondratuk", "Denis5", "Oleksandrovich", "man", 8900, 0, "Salers")));
        System.out.println(firma.addEmployee(new Employee("Kondratuk", "Denis0", "Oleksandrovich", "man", 8900, 0, "Salers")));
        Manager manager1 = new Manager("Kondratuk", "Denis0", "Oleksandrovich", "man", 8900, 0, "Salers", "Managers");
        System.out.println(firma.addEmployee(manager1));

        department.setManagerDepartment(manager1);
        firma.getDepartments().add(department);
    }
}
