package userTest;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Iliren on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Base base = new Base();

        base.usersToFile("/users.txt");
char[]ch={'/'};
        System.out.println(Arrays.toString(base.usersFromFile("users.txt")));
//        System.out.println(Integer.valueOf(String.valueOf(ch)));
    }


}
