package lessons8.dzLessons7_8;

/**
 * Created by Denni on 11.08.2016.
 */
public class Seller extends Employee {
    private float sale;

    public Seller(String surname, String name, String middlename, String sex, float salary, float bankAccount, String department, float sale) {
        super(surname, name, middlename, sex, salary, bankAccount, department);
        this.sale = sale;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", sale = " + sale
                + '}';
    }

    @Override
    public float takeSalary() {
        return getSalary() + sale * 0.3f;
    }
}
