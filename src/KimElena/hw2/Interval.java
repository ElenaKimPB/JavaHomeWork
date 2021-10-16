package KimElena.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        num1 = scanner.nextInt();
               if (num1 >= 0 && num1 <= 14)  { System.out.println("Значение " + num1 + " попадает в интервал [0 -14]");
        } else if (num1 > 14 && num1 <= 35)  { System.out.println("Значение " + num1 + " попадает в интервал [15 - 35]");
        } else if (num1 > 35 && num1 <= 50)  { System.out.println("Значение "+num1+" попадает в интервал [36 - 50]");
        } else if (num1 > 50 && num1 <= 100) { System.out.println("Значение "+num1+" попадает в интервал [51 - 100]");
        } else                               {System.out.println("Значение "+num1+" не попадает ни в однин интервал [0 - 100]");
               }
    }
}
