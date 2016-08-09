package lessons2.homeWorks1_2.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Ilirenon 17.07.2016.
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/array.txt");
        Scanner scanner = new Scanner(reader);
        String str = "";

        int tr = 0;
        while (scanner.hasNextLine()) {
            str += scanner.nextLine();
            str += ";";
            tr++;
        }
        String[] s = str.split(";");
        String[] trs;
        int td = s[0].split(" ").length;

        int[][] array = new int[tr][td];
        for (int i = 0; i < s.length; i++) {
            trs = s[i].split(" ");
            for (int j = 0; j < trs.length; j++) {
                array[i][j] = Integer.valueOf(trs[j]);
            }
        }

        for (int i = 0; i < tr; i++) {
            for (int j = 0; j < td; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();

        }

        System.out.println(array.length+" "+ array.length);
    }
}
