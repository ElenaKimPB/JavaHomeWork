package KimElena.hw4;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {
    static void inMetod(String out) {
        System.out.println(out);
    }

    public static void main(String[] args) {
        String text;
        String out = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите пожалуйста текст");

        text = scan.nextLine();
        out = out + text.substring(0, 1).toUpperCase();
         for (int i = 1; i < text.length(); i++) {             // смотрим, был ли слева пробел:
            if (" ".equals(text.substring(i - 1, i)))
                out = out + text.substring(i, i + 1).toUpperCase();
            else
                out = out + text.substring(i, i + 1);
        }
        inMetod(out);
    }

}


