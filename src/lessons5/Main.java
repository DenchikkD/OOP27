package lessons5;

/**
 * Created by Denni on 25.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 20;
        person1.name = "Vasia";

//        Dog dog1 = new Dog();
//        dog1.breed = "Ovcharka";

        Person person2 = new Person();
        person2.age = 40;
        person2.name = "Petro";

        person1.print();
        person2.print();




//        printPerson(person1);
//        printPerson(person2);
    }

    public static void printPerson(Person p) {
        System.out.println(p.age + " " + p.name);
    }


}
