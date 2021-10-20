package KimElena.hw3;

import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        int bingo = 20;      // Задуманное число.
        int userValue;
        Scanner scan = new Scanner(System.in);

        System.out.println("Отгадайде число в диапазоне 0-100.");
        System.out.println("Для выхода из программы введите  -1.");

        userValue = scan.nextInt();
        int attempt = 0;           // Счетчик попыток.

        while (userValue != bingo) {
            if (userValue == -1) {
                System.out.println("Осуществлен досрочный выход из программы");
                break;
            }
            attempt++;
            System.out.println("Попытка " + attempt);
             if (userValue < bingo) {
                 System.out.println("Попробуйте еще раз, введите число больше");
             } else {
                 System.out.println("Попробуйте еще раз, введите число меньше");
             }
             userValue = scan.nextInt();
            continue;
            }
        if (userValue == bingo) {
            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");

               }
        System.out.println("Конец игры!");
    }
    }


