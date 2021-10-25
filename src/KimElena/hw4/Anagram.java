package KimElena.hw4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        String text1 = "";
        String text2 = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите пожалуйста текст 1");
                text1 = scan.nextLine();
        String arr1 = removePunct(text1);
        System.out.println("Введите пожалуйста текст 2");
                text2 = scan.nextLine();
        String arr2 = removePunct(text2);

        Boolean result = arr1.equals(arr2);
        System.out.println("Являются ли оба текста анаграммой? - " +result );
          }

    public static String removePunct (String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.toUpperCase().charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                result.append(c);
            }
        }
        char[] chars = result.toString().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


    }

