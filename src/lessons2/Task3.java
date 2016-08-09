package lessons2;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Denni on 12.07.2016.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {


        FileReader reader = new FileReader(args[0]);
        Scanner scn = new Scanner(reader);
        FileWriter writer = new FileWriter(args[1], true);
        while (scn.hasNextLine()) {
            writer.write(scn.nextLine());
            writer.write(System.lineSeparator());
        }
        writer.flush();
        writer.close();


    }
}
