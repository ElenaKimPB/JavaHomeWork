package KimElena.hw12;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Person implements Serializable {

    public String getFIO() {
        return FIO;
    }

    String FIO;
    LocalDate dateBorn;
    List<String> phonNums;
    String addr;
    Date lastEdit2;

    private SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public Person(String FIO, LocalDate dateBorn, List<String> phonNums, String addr, Date lastEdit) {
        this.FIO = FIO;
        this.dateBorn = dateBorn;
        this.phonNums = new LinkedList<>(phonNums);
        this.addr = addr;
        this.lastEdit2 = lastEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person user = (Person) o;
        return Objects.equals(FIO, user.FIO) &&
                Objects.equals(dateBorn, user.dateBorn) &&
                Objects.equals(phonNums, user.phonNums) &&
                Objects.equals(addr, user.addr) &&
                Objects.equals(lastEdit2, user.lastEdit2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, dateBorn, phonNums, addr, lastEdit2);
    }

    @Override
    public String toString() {
        return System.lineSeparator()+"{" +
                "FIO = " + FIO +
                " | dateBorn = " + dateBorn +
                " | addr = " + addr + '\'' +
                " | lastEdit = " + formater.format(lastEdit2) +
                " | phonNums = " + Arrays.toString(phonNums.toArray()) + "}";
    }

}

