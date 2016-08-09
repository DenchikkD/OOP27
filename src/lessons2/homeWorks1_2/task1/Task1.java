package lessons2.homeWorks1_2.task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Denni on 14.07.2016.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/text.txt");
        FileWriter writer = new FileWriter("D:\\progects/OOP/main/FileDirectory/text3.txt", true);

        Scanner scn = new Scanner(reader);
        StringBuilder stringBuilder = new StringBuilder();
        while (scn.hasNextLine()) {
            stringBuilder.append("\n**** " + scn.nextLine() + " \n");
//            stringBuilder.append(System.lineSeparator());
        }
        writer.write(stringBuilder.reverse().toString());
        writer.flush();
        writer.close();

    }


}
