package KimElena.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("введите 1е число");
        operand1 = scan.nextInt();
//        System.out.println(operand1);
        System.out.println("введите 2е число");
        operand2 = scan.nextInt();
//        System.out.println(operand2);
        System.out.println("введите знак");
        sign = scan.next();

        switch (sign) {
            case "+": System.out.println((operand1+ " " + sign + " " + operand2 + " = " +(operand1 + operand2)));break;
            case "-": System.out.println((operand1+ " " + sign + " " + operand2 + " = " +(operand1 - operand2)));break;
            case "*": System.out.println((operand1+ " " + sign + " " + operand2 + " = " +(operand1 * operand2)));break;
            case "/": if (operand2 == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                System.out.println((operand1+ " " + sign + " " + operand2 + " = " +(operand1 / operand2)));break;
            }
        }
    }
}

