package userTest;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Iliren on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Base base = new Base();
        base.addToArray(new User("Denis1", "denni", "1111", "25.09.2016"));
        base.addToArray(new User("Denis2", "denni", "1111", "25.09.2016"));
        base.addToArray(new User("Denis3", "denni", "1111", "25.09.2016"));
        base.addToArray(new User("Denis4", "denni", "1111", "25.09.2016"));
        base.addToArray(new User("Denis5", "denni", "1111", "25.09.2016"));
        base.addToArray(new User("Denis6", "denni", "1111", "25.09.2016"));
        base.addToArray(new User("Denis1", "denni", "1111", "25.09.2016"));
        base.addToArray(new User("Denis1", "denni1", "1111", "25.09.2016"));
        base.addToArray(new User("Denis3", "denni", "1111", "25.09.2016"));

        base.usersToFile("/users.txt");
        char[] ch = {'/'};
        System.out.println(Arrays.toString(base.usersFromFile("users.txt")));
//        System.out.println(Integer.valueOf(String.valueOf(ch)));
    }


}
