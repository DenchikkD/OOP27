package lessons6;

/**
 * Created by Denni on 26.07.2016.
 */
public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Ford";
        car1.onOff = false;
        car1.ostatokInTank = 10;
        car1.tankCapacity = 50;
        car1.rashodOneKm = 0.1f;
        car1.runing = 10;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.onOff = false;
        car2.ostatokInTank = 10;
        car2.tankCapacity = 40;
        car2.rashodOneKm = 0.3f;
        car2.runing = 10;

        Car car3 = new Car();
        car3.brand = "Subaru";
        car3.onOff = false;
        car3.tankCapacity = 60;
        car3.ostatokInTank = 15;
        car3.rashodOneKm = 0.15f;
        car3.runing = 10;

        car1.printAbourMe();
        car2.printAbourMe();
        car3.printAbourMe();

        car1.reFull();
        car1.drive(110);

    }
}
