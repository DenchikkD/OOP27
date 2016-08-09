package lessons2.homeWorks1_2.Task0;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 0. Читаем строку из файла - пишем в другой файл только символы верхнего регистра, которые встречаются в файле.
 * Created by Denni on 14.07.2016.
 */
public class Task0 {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/text.txt");
        Scanner scn = new Scanner(reader);
        FileWriter writer = new FileWriter("D:\\progects/OOP/main/FileDirectory/text2.txt", true);

        while (scn.hasNextLine()) {

            String str = scn.nextLine();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (Character.isUpperCase(ch[i])) {
                    writer.write(ch[i]);
                }

            }
            writer.write(System.lineSeparator());
        }
        writer.flush();
        writer.close();

    }


}

