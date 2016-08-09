package lessons2.homeWorks1_2.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Denni on 17.07.2016.
 */
public class Task3 {
    private FileReader reader;
    private FileWriter writer;
    private Scanner scanner;

    public Task3() throws IOException {
        reader = new FileReader("D:\\progects/OOP/main/FileDirectory/text.txt");
        writeFile(changeCase(readFile(reader, scanner)));
    }

    public String readFile(FileReader reader, Scanner scn) {
        scn = new Scanner(reader);
        String fileText = "";
        while (scn.hasNextLine()) {
            fileText += scn.nextLine();
            fileText += " ";
        }
        return fileText;
    }

    public String changeCase(String str) {
        String result = "";
        String tmp;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            tmp = String.valueOf(ch[i]);
            if (tmp.equals(tmp.toLowerCase())) {
                result += tmp.toUpperCase();
            } else {
                result += tmp.toLowerCase();
            }
        }
        return result;
    }

    public void writeFile(String str) throws IOException {
        writer = new FileWriter("D:\\progects/OOP/main/FileDirectory/text4.txt", true);
        writer.write(str);
        writer.flush();
        writer.close();
    }
}
