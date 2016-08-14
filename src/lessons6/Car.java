package lessons6;

/**
 * Created by Denni on 26.07.2016.
 */
public class Car {

    private String brand;
    private float rashodOneKm;
    private int runing;
    private int tankCapacity;
    private float ostatokInTank;
    private boolean onOff;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getRashodOneKm() {
        return rashodOneKm;
    }

    public void setRashodOneKm(float rashodOneKm) {
        this.rashodOneKm = rashodOneKm;
    }

    public int getRuning() {
        return runing;
    }

    public void setRuning(int runing) {
        this.runing = runing;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public float getOstatokInTank() {
        return ostatokInTank;
    }

    public void setOstatokInTank(float ostatokInTank) {
        this.ostatokInTank = ostatokInTank;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public boolean start() {
        if (ostatokInTank > 0) {
            onOff = true;

            return true;
        }
        return false;
    }

    public void drive(int mils) {
        int startMils = mils;
        if (onOff) {
            while (ostatokInTank > 0 && mils > 0) {
                ostatokInTank -= rashodOneKm;
                mils--;
            }
            if (mils == 0) {
                System.out.println(brand + " проехала: " + startMils);
            } else {
                System.out.println(brand + " Заглохла, но проехала:" + (startMils - mils));
                onOff = false;
            }
            System.out.println("Остаток: " + ostatokInTank);
        } else {
            System.out.println("Машина не заведена!!!");
        }
    }


    public void printAbourMe() {
        System.out.println("Марка автомобиля " + brand +
                "\nРасход " + rashodOneKm +
                "\nПробег " + runing +
                "\nОбем бака " + tankCapacity +
                "\nОстаток топлива " + ostatokInTank +
                "\n");
    }

    public void reFull() {
        System.out.println(brand + " Заправлено на: " + (tankCapacity - ostatokInTank) + " литр");
        ostatokInTank = tankCapacity;

    }


}
