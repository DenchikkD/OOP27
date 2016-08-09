package lessons5.dzLessons5_6;

/**
 * Created by Iliren on 03.08.2016.
 * 1. Написать класс число (Number), хранящий целое число и выполняющий следующие операции:
 * - получение примитива (метод int get())
 * - сложение (метод Number add(Number num))
 * - вычитание (метод Number sub(Number num))
 * - умножение (метод Number mul(Number num))
 * - деление (метод Number div(Number num))
 * - возведение в степень (метод Number pow(Number exponent))
 * - вычисление факториала (метод Number fact())
 * - вычисление остатка от деления (метод Number mod(Number num))
 */
public class Number {
    int num;

    public Number() {
    }

    public Number(int num) {
        this.num = num;
    }

    public int get() {
        return num;
    }

    public Number add(Number num) {
        return new Number(this.num += num.get());
    }

    public Number sub(Number num) {
        this.num -= num.get();
        return this;
    }

    public Number mul(Number num) {
        this.num *= num.get();
        return this;
    }

    public Number div(Number num) {
        this.num /= num.get();
        return this;
    }

    public Number pow(Number exponent) {
        this.num = (int) Math.pow(num, exponent.get());
        return this;
    }

    public Number fact() {
        this.num = factRecurs(num);
        return this;
    }

    public int factRecurs(int num) {
        if (num == 1) {
            return num;
        }
        return num + factRecurs(num - 1);
    }

    public Number mod(Number num) {
        this.num = this.num % num.get();
        return this;
    }


}
