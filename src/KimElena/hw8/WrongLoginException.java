package KimElena.hw8;

public class WrongLoginException extends Exception {
    String er;

    public WrongLoginException(String er) {
        this.er = er;
    }
}
