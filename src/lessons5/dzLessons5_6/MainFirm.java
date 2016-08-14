package lessons5.dzLessons5_6;

/**
 * Created by Denni on 08.08.2016.
 */
public class MainFirm {
    public static void main(String[] args) {
        Firm firm = new Firm("Nano", 100_000);
        System.out.println(firm.addEmployee("Vova", "Kirov", 3700, 0, "Man", "worker"));
        System.out.println(firm.addEmployee("Vova1", "Kirov", 3800, 0, "Man", "worker"));
        System.out.println(firm.addEmployee("Vova2", "Kirov", 3900, 0, "Man", "worker"));
//        System.out.println(firm.getAllEmployees().get(0).name);
        System.out.println(firm.getEmployees().get(1));
        System.out.println(firm.getEmployees().get(2));

    }
}
