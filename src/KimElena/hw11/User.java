package KimElena.hw11;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class User implements Serializable {
    String FIO;
    LocalDate dateBorn;
    List<String> phonNums;
    String addr;
    Date lastEdit;

    private SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public User(String FIO, LocalDate dateBorn, List<String> phonNums, String addr, Date lastEdit) {
        this.FIO = FIO;
        this.dateBorn = dateBorn;
        this.phonNums = new LinkedList<>(phonNums);
        this.addr = addr;
        this.lastEdit = lastEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(FIO, user.FIO) &&
                Objects.equals(dateBorn, user.dateBorn) &&
                Objects.equals(phonNums, user.phonNums) &&
                Objects.equals(addr, user.addr) &&
                Objects.equals(lastEdit, user.lastEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, dateBorn, phonNums, addr, lastEdit);
    }

    @Override
    public String toString() {
        return System.lineSeparator()+"{" +
                "FIO = " + FIO +
                " | dateBorn = " + dateBorn +
                " | addr = " + addr + '\'' +
                " | lastEdit = " + formater.format(lastEdit) +
                " | phonNums = " + Arrays.toString(phonNums.toArray()) + "}";
    }
}
