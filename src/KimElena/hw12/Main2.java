package KimElena.hw12;

import java.time.LocalDate;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {

        PhoneBook2 phoneBook = new PhoneBook2();

        Person sql = new Person("Шкабара", LocalDate.of(1989, 9, 10), Arrays.asList("1"), "topSecret", new Date());
        phoneBook.addElem(sql);
        phoneBook.addElem(new Person("Щербина",LocalDate.of(1979,8,10), Arrays.asList("1111","22222"), "topSecret",new Date()));
        phoneBook.addElem(new Person("Шкабара2",LocalDate.of(1995,6,1), Arrays.asList("3333","44444"), "Dnepr1",new Date()));
        phoneBook.addElem(new Person("Ким",LocalDate.of(1982,12,10), Arrays.asList("kievstar","peopleNet"), "Dnepr2",new Date()));

        phoneBook.printSortedByFio();
        phoneBook.remove(sql);
        phoneBook.printSortedByDateBorn();
        phoneBook.addElem(sql);
        phoneBook.findByFio("Вася");
        phoneBook.findByFio("Шкабара");
        phoneBook.getIndex(sql);
        sql.phonNums.add("2");
        sql.phonNums.add("332211");
        phoneBook.updateUserInfo(3,sql);
        phoneBook.findByFio("Шкабара");
        phoneBook.exportToFile("D:\\phoneBook.txt");
        phoneBook.ImportFromFile("D:\\phoneBook.txt");
        phoneBook.printSortedByFio();
    }
}
