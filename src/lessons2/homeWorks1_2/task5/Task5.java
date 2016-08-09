package lessons2.homeWorks1_2.task5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Denni on 18.07.2016.
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        String fiend = "para";
        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/text5.txt");
        Scanner scn = new Scanner(reader);
        int countLine = 0;
        int countNumberVords = 1;

        while (scn.hasNextLine()) {
            countLine++;
            String[] str = scn.nextLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                if (str[i].contains(fiend)) {
                    System.out.println(countLine + "-я строка " + countNumberVords + "-е слово " + str[i]);
                    countNumberVords++;
                } else {
                    countNumberVords++;
                }
            }
            countNumberVords = 1;
        }
    }
}
