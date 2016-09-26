package userTest;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Iliren on 24.09.2016.
 */
public class Base {

    private User[] users = new User[15];
    private FileWriter writer;
    private FileReader reader;
    private int count = 0;


    public void addToArray(User user) {
        System.out.println();
        System.out.println("____________________");

        boolean flag = true;
        for (int i = 0; i <= count; i++) {
            if (user.equals(users[i])) {
                flag = false;
            }
        }
        if (flag) {
            users[count] = user;
            System.out.println("++++++++");
            count++;
        } else {
            System.out.println("Такий користувач уже існує!!!");
        }
    }

    public void usersToFile(String fileName) throws IOException {
        writer = new FileWriter("D:\\projects/OOP27/FileDirectory" + fileName);
        StringBuilder builder = new StringBuilder();
        int count = 0;

        while (users[count] != null) {

            builder.append(users[count].getName()).append(" ").append(users[count].getLogin()).append(" ").
                    append(users[count].getPass()).append(" ").append(users[count].getDateOfExpire()).append(System.lineSeparator());

            count++;
        }
        writer.write(builder.toString());
        writer.flush();
        writer.close();
    }

    public User[] usersFromFile(String fileName) throws FileNotFoundException {
        User[] usersFromFile = new User[15];
        reader = new FileReader("D:\\projects/OOP27/FileDirectory/" + fileName);
        Scanner scn = new Scanner(reader);
        int count = 0;
        while (scn.hasNextLine()) {
            String str = scn.nextLine();

            String[] strings = str.split(" ");
            usersFromFile[count] = new User(strings[0], strings[1], strings[2], strings[3]);
            count++;
        }
        return usersFromFile;
    }

}
