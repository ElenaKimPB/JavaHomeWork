package KimElena.hw8;

public class WrongPasswordException extends Exception {
    String pas;

    public WrongPasswordException(String pas) {
        this.pas = pas;
    }
}
