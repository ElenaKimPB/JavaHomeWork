package KimElena.hw8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {

    String login;
    String password;
    boolean status;

    public void signUp(String login, String password, String confirmPassword) {
        try {
            status = true;
            if (login.length() < 5 || login.length() > 20) {
                status = false;
                throw new WrongLoginException("Не верная длина логина");
            }
            Pattern pattern1 = Pattern.compile("[a-zA-Z0-9]+");
            Matcher matcher1 = pattern1.matcher(login);
            //System.out.println (matcher1.matches());
            if (!matcher1.matches()) {
                status = false;
                throw new WrongLoginException("Логин может содержать только латинские буквы и цифры");
            }

            if (password.length() < 5) {
                status = false;
                throw new WrongPasswordException("Длинна пароля должна быть не менее 5 символов");
            }
            Pattern pattern2 = Pattern.compile("[a-zA-Z0-9_]+");
            Matcher matcher2 = pattern1.matcher(login);
            //System.out.println (matcher1.matches());
            if (!matcher2.matches()) {
                status = false;
                throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и _");
            }
            if (!password.equals(confirmPassword)) {
                status = false;
                throw new WrongPasswordException("Подтверждение пароля не соответствует паролю");
            }

        } catch (WrongLoginException ex) {
            System.out.println("обработка исключения - WrongLoginException " + ex.er);
        } catch (WrongPasswordException ex) {
            System.out.println("обработка исключения - WrongPasswordException " + ex.pas);
        }
        this.login = login;
        this.password = password;
    }

    public void signIn(String login, String password) {
        try {
            if (!login.equals(this.login)) {
                status = false;
                throw new WrongLoginException("Не верный логин");
            }

            if (!password.equals(this.password)) {
                status = false;
                throw new WrongPasswordException("Не верный пароль");
            }

        } catch (WrongLoginException ex) {
            System.out.println("обработка исключения - WrongLoginException " + ex.er);
        } catch (WrongPasswordException ex) {
            System.out.println("обработка исключения - WrongPasswordException " + ex.pas);
        }
    }
}

