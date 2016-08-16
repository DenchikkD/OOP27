package lessons10;

import java.util.Comparator;

/**
 * Created by Denni on 16.08.2016.
 */
public class Person {
    public static final Comparator<Person> BY_AGE = (p1, p2) -> Integer.compare(p1.age, p2.age);
    public static final Comparator<Person> BY_Name = (p1, p2) -> p1.name.compareToIgnoreCase(p2.name);
    public static final Comparator<Person> BY_S_Name = (p1, p2) -> p1.sName.compareToIgnoreCase(p2.sName);

    private String name;
    private String sName;
    private int age;

    public Person(String name, String sName, int age) {
        this.name = name;
        this.sName = sName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                " name = '" + name + '\'' +
                ", sName = '" + sName + '\'' +
                ", age = " + age +
                '}';
    }
}
