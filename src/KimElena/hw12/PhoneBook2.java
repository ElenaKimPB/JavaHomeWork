package KimElena.hw12;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class PhoneBook2 implements Serializable {

    private List<Person> users = new LinkedList<>();

    public void addElem (Person person){
        users.add(person);
    }

    public void remove (int index){
        users.remove(index);
    }

    public void remove (Person person){
        users.remove(person);
    }

    public void findByFio (String fio){

        System.out.println("Работает метод findByFio! ");

        List<Person> rez = new ArrayList<>();

        for (Person person:users) {
            if(person.FIO
                    .trim()
                    .toUpperCase()
                    .contains(fio.toUpperCase())){

                rez.add(person);
            }
        }
        if(rez.size()==0){
            System.out.println("такой элемент не найден");
        } else {
            System.out.println(rez.toString());
        }
    }

    public Person find(Person person){
        int index = users.indexOf(person);
        if(index == -1){
            System.out.println("такой элемент не найден");
            return new Person("none", LocalDate.now(), Arrays.asList("none","none"), "none",new Date());
        } else {
            return users.get(index);
        }
    }

    public int getIndex (Person person){
        int index = users.indexOf(person);
        System.out.println(index +" - индекс элемента " + person.FIO);
        return index;
    }

    public void printSortedByFio(){
        users.stream()
                .sorted(Comparator.comparing(Person::getFIO))
                .forEach(System.out::println);

    }

    public void printSortedByDateBorn(){
        users.sort(Comparator.comparing(o -> o.dateBorn));
        System.out.println(users.toString());
    }

    public void updateUserInfo(int index, Person pers){

        if(index <0 ||index>users.size() ){
            System.out.println("элемент не найден");
        } else {
            pers.lastEdit2 = new Date();
            users.set(index, pers);
        }
    }
    public void exportToFile(String fileName){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(users);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ImportFromFile(String fileName){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            users.addAll((List<Person>) ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

