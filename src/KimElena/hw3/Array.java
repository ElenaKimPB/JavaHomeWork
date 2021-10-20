package KimElena.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        int tmp;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Введите " + i + "-й элемент массива");
            tmp = scan.nextInt();
            myArr[i] = tmp;
        }
        //Вывести на экран введенный массив.
        System.out.println(Arrays.toString(myArr));

        //Подсчитать сумму всех элементов массива и вывести ее на экран
        for (int i = 0; i < myArr.length; i++) {
            sum += myArr[i];
        }
        System.out.println("Сумма всех элементов массива равна " + sum);  // сумма всех элементов массива

        //Подсчитать и вывести на экран количество положительных элементов.
        tmp = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > 0) {
                tmp += 1;
            }
        }
        System.out.println("Количество положительных элементов " + tmp);
        // Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
        //Вывести на экран отсортированный массив.
        int tmp2;
        for (int out = myArr.length - 1; out >= 1; out--) {  //Внешний цикл
            for (int in = 0; in < out; in++) {               //Внутренний цикл
                if (myArr[in] > myArr[in + 1]) {             //Если порядок элементов нарушен
                    tmp2 = myArr[in];
                    myArr[in] = myArr[in + 1];
                    myArr[in + 1] = tmp2;
                }
            }
        }
        System.out.println(" Отсортированный массив: " + Arrays.toString(myArr));
    }
}
