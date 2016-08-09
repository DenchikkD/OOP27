package lessons2.homeWorks1_2.task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Denni on 17.07.2016.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/OtherTextTask4.txt");
        FileWriter writer = new FileWriter("D:\\progects/OOP/main/FileDirectory/OtherTextTask4(1).txt", true);
        Scanner scn = new Scanner(reader);
        String textFile = "";
        while (scn.hasNextLine()) {
            textFile += scn.nextLine();
        }
        String[] textOfFile = textFile.split(" ");
        FileReader readerSweardWords = new FileReader("D:\\progects/OOP/main/FileDirectory/SwearWords.txt");

        Scanner scnswear = new Scanner(readerSweardWords);
        String swearWordsStr = "";
        while (scnswear.hasNextLine()) {
            swearWordsStr += scnswear.nextLine();
        }
        String[] swearWords = swearWordsStr.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < textOfFile.length; i++) {
            for (int j = 0; j < swearWords.length; j++) {
                if (textOfFile[i].equalsIgnoreCase(swearWords[j])) {
                    textOfFile[i] = "[вирізано цензурою]";
                }
            }
            builder.append(textOfFile[i]);
            builder.append(" ");
        }
        String result = builder.toString();
        writer.write(result);
        writer.flush();
        writer.close();
        String words = "hello word";
        String str = words.replaceAll("hello", "[foo]");
        System.out.println(str);
        System.out.println(words);
    }
}
