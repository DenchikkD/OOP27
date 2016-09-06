package lessons13;

import lessons10.Person;

import java.util.Date;

/**
 * Created by Denni on 06.09.2016.
 */
public class Task {

    public static void main(String[] args) {
        OfDate<Person> personOfDate = new OfDate<>(new Person("", "", 16));
        OfDate<Integer> IntegerOfDate = new OfDate<>(10);

    }
}

class OfDate<T> {

    private T value;
    private Date date;

    public OfDate(T value) {
        this.value = value;
        this.date = new Date();
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StrinfOfDate{" +
                "value = '" + value + '\'' +
                ", date = " + date +
                '}';
    }

    public Date getDate() {
        return date;
    }
}
