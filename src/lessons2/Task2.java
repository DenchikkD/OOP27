package lessons2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Denni on 12.07.2016.
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/text.txt");
        Scanner scn = new Scanner(reader);
        while (scn.hasNextLine()){
            System.out.println(scn.nextLine());

        }

    }
}
