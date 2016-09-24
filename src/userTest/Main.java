package userTest;

import java.io.IOException;

/**
 * Created by Iliren on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Base base = new Base();

        base.usersToFile("users.txt");

    }
}
