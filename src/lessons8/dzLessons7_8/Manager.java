package lessons8.dzLessons7_8;

/**
 * Created by Denni on 11.08.2016.
 * Менеджер:
 * все что и у обычного +
 * - подчиненный отдел
 */
public class Manager extends Employee {
    private String subordinateDepartment;

    public Manager(String surname, String name, String middlename, String sex, float salary, float bankAccount, String department, String subordinateDepartment) {
        super(surname, name, middlename, sex, salary, bankAccount, department);
        this.subordinateDepartment = subordinateDepartment;
    }
}
