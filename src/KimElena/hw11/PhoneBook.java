package KimElena.hw11;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class PhoneBook implements Serializable {

    private List<User> users = new LinkedList<>();

    public void addElem (User user){
        users.add(user);
    }

    public void remove (int index){
        users.remove(index);
    }

    public void remove (User user){
        users.remove(user);
    }

    public void findByFio (String fio){

        System.out.println("Работает метод findByFio! ");

        List<User> rez = new ArrayList<>();

        for (User user:users) {
            if(user.FIO
                    .trim()
                    .toUpperCase()
                    .contains(fio.toUpperCase())){

                rez.add(user);
            }
        }
        if(rez.size()==0){
            System.out.println("такой элемент не найден");
        } else {
            System.out.println(rez.toString());
        }
    }

    public User find(User user){
        int index = users.indexOf(user);
        if(index == -1){
            System.out.println("такой элемент не найден");
            return new User("none", LocalDate.now(), Arrays.asList("none","none"), "none",new Date());
        } else {
            return users.get(index);
        }
    }

    public int getIndex (User user){
        int index = users.indexOf(user);
        System.out.println(index +" - индекс элемента " + user.FIO);
        return index;
    }

    public void printSortedByFio(){
        users.sort(Comparator.comparing(o -> o.FIO));
        System.out.println(users.toString());
    }

    public void printSortedByDateBorn(){
        users.sort(Comparator.comparing(o -> o.dateBorn));
        System.out.println(users.toString());
    }

    public void updateUserInfo(int index,User user){

        if(index <0 ||index>users.size() ){
            System.out.println("элемент не найден");
        } else {
            user.lastEdit = new Date();
            users.set(index,user);
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
            users.addAll((List<User>) ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
