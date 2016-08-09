package lessons2;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Denni on 12.07.2016.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/text.txt");
        char[] chArray = new char[11];
        int count;
//        System.out.println(count);
//        System.out.println(chArray);

        String res = "";
        StringBuilder builder = new StringBuilder(); //Динамічна строка, яку можна змінювати


        while ((count = reader.read(chArray)) != -1) {
//            String parth = new String(chArray, 0, count);
            builder.append(chArray,0,count);// приклеюэ до ыснуючоъ строки масив чарыв
//            res += parth;
//            for (int i = 0; i <count ; i++) {
//                res+=(char)chArray[i];
//
//            }

        }
        String result = builder.toString();

        System.out.println(result);

//        int ch;
//        String str = "";
//        while ((ch = reader.read()) != -1) {
//            str += (char)ch;
////            System.out.println(ch);
//        }
//        System.out.println(str);


//        int ch = 0;
//
//        while(ch!=-1){
//            ch = reader.read();
//            System.out.println(ch);
//        }

//        do {
//            ch = reader.read();
//            System.out.println(ch);
//        } while (ch != -1);

//        for (int i = 0; i <300000 ; i++) {
//         int   ch=reader.read();
//
//            System.out.print(ch);
//        }


    }
}
