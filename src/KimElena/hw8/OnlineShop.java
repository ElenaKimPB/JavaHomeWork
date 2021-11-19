package KimElena.hw8;

import java.util.Scanner;

public class OnlineShop extends Auth {

    public static void main(String[] args) {

        String usrInLogin = null;
        String usrInPass = null;
        String usrInConfPass = null;

        Auth auth = new Auth();
        System.out.println("Зарегистрируйтесь на сайте");
            Scanner scan = new Scanner(System.in);
            String sign;
            System.out.println("Введите логин");
        usrInLogin = scan.nextLine();

            System.out.println("Введите пароль");
        usrInPass = scan.nextLine();

        System.out.println("Подтвердите пароль");
        usrInConfPass = scan.nextLine();

     auth.signUp(usrInLogin, usrInPass, usrInConfPass);
        if(auth.status){
            System.out.println("Вы успешно прошли регистрацию на сайте");
            System.out.println("Войдите в личный кабинет");
            System.out.println("Введите логин");
            usrInLogin = scan.nextLine();

            System.out.println("Введите пароль");
            usrInPass = scan.nextLine();
        }

     auth.signIn(usrInLogin, usrInPass);

     if(auth.status){
         System.out.println("Добро пожаловать " + usrInLogin);
     }
    }
}
