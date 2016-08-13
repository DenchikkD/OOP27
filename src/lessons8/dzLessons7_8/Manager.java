package lessons8.dzLessons7_8;

/**
 * Created by Denni on 11.08.2016.
 * Менеджер:
 * все что и у обычного +
 * - подчиненный отдел
 */
public class Manager extends Employee {
        private String subordinateDepartmentString;
    private Department subordinateDepartment;


    public Manager(String surname, String name, String middlename, String sex, float salary, float bankAccount, String department) {
        super(surname, name, middlename, sex, salary, bankAccount, department);

    }

    public Department getSubordinateDepartment() {
        return subordinateDepartment;
    }

    public void setSubordinateDepartment(Department subordinateDepartment) {
        this.subordinateDepartment = subordinateDepartment;
    }
        public Manager(String surname, String name, String middlename, String sex, float salary, float bankAccount, String department, String subordinateDepartmentString) {
        super(surname, name, middlename, sex, salary, bankAccount, department);
        this.subordinateDepartmentString = subordinateDepartmentString;
    }
}
