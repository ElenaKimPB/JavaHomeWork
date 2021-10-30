package KimElena.hw5;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.Arrays;

public class Library {

     static void printReaders(Reader[] readers){
         System.out.println("Печатаем Reader: ");
         for (int i = 0; i < readers.length; i++) {
             System.out.println(readers[i].toString());
         }
    }
    static void printBooks(Book [] books) {
        System.out.println("Печатаем Book: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());

        }
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();


        book1.setName("Приключения");
        book2.setName("Словарь");
        book3.setName("Энциклопедия");

        book1.setAuhtor("Иванов И. И.");
        book2.setAuhtor("Сидоров А.В.");
        book3.setAuhtor("Гусев К.В.");

        book1.setYear("2020");
        book2.setYear("1980");
        book3.setYear("2010");


        Reader reader1 = new Reader("Петров В.В.","1","экономический","10.11.80","0553216547");
        Reader reader2 = new Reader("Шкира В.В.","2","психологический","01.01.81","0569876547");
        Reader reader3 = new Reader("Усачев А.И.","3","экономический","22.05.79","0658527946");

        Book [] books = new Book[]{book1,book2,book3};


        reader1.takeBook(3);
        reader1.takeBook(new String[]{book1.getName(),book2.getName(), book3.getName()});
        reader1.takeBook(books);
        Reader [] readers = new Reader[]{reader1,reader2, reader3};

        reader1.returnBook(3);
        reader1.returnBook(new String[]{book1.getName(),book2.getName(), book3.getName()});
        reader1.returnBook(books);

        printReaders(readers);
        printBooks(books);

     }
}
