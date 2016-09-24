package userTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.SyncFailedException;

/**
 * Created by Iliren on 24.09.2016.
 */
public class Base {

    private User[] user = new User[15];
    private FileWriter writer;

    public Base() throws IOException {
        user[0] = new User("Denis1", "denni", "1111", "25.09.2016");
        user[1] = new User("Denis2", "denni", "1111", "25.09.2016");
        user[2] = new User("Denis3", "denni", "1111", "25.09.2016");
        user[3] = new User("Denis4", "denni", "1111", "25.09.2016");
        user[4] = new User("Denis5", "denni", "1111", "25.09.2016");
        user[5] = new User("Denis6", "denni", "1111", "25.09.2016");
    }

    void usersToFile(String fileName) throws IOException {
        writer = new FileWriter("D:\\progects/OOP27/FileDirectory/"+fileName);
        StringBuilder builder = new StringBuilder();
        int count = 0;
        while (user[count] != null) {
            builder.append(user[count].getName()).append(" ").append(user[count].getLogin()).append(" ").
                    append(user[count].getPass()).append(" ").append(user[count].getDateOfExpire()).append(System.lineSeparator());
            count++;
        }
        writer.write(builder.toString());
        writer.flush();
    }


}
