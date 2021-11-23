package KimElena.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args) {

        String numbers = "C://Users//vova//Desktop//JAVA//numbers.txt";

        String numbers_odd = "C://Users//vova//Desktop//JAVA//odd-numbers.txt";

        createNumbersFile(numbers);

        createOddNumbersFile(numbers, numbers_odd);
    }

    private static void createOddNumbersFile(String numbers, String numbers_odd) {

        createFile(numbers_odd);

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(numbers)));
             Writer writer = new FileWriter(numbers_odd)) {
            StringBuilder sb = new StringBuilder();
            String line;
            StringBuilder rezLine = new StringBuilder();
            //внешний цикл читает строки из файла
            while ((line = reader.readLine()) != null) {
                char[] arr = line.toCharArray();
                //внутренний читает символы в строке
                for (char c : arr) {
                    if (!Character.isWhitespace(c)) {
                        sb.append(c);
                        continue;
                    } else {
                        if (Integer.parseInt(sb.toString()) % 2 > 0) {
                            rezLine.append(sb).append(" ");
                        } else {
                            rezLine.append(0).append(" ");
                        }
                        sb.setLength(0);
                    }
                }
                System.out.println(line);
                writer.write(rezLine.append(System.lineSeparator()).toString());
                writer.flush();
                System.out.println(rezLine.toString());
                System.out.println("-------------------------------");
                rezLine.setLength(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createNumbersFile(String numbers) {

        createFile(numbers);

        try (Writer writer = new FileWriter(numbers)) {

            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                String str = "";
                for (int j = 0; j < 10; j++) {
                    str += random.nextInt(100) + " ";

                }
                str += System.lineSeparator();
                writer.write(str);
                writer.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void createFile(String fileName) {
        try {
            if (Files.exists(Paths.get(fileName)))
                Files.delete(Paths.get(fileName));
            Files.createFile(Paths.get(fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}