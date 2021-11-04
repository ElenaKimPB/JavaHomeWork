package KimElena.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception  {

        Animal[] animals = new Animal[] {new Dog(), new Cat(), new Horse()};

        //Veterinarian veterinarian = new Veterinarian();

        Veterinarian veterinarian=null;

        Class clazz = Class.forName(Veterinarian.class.getName());
        //рефлексия вариант1 через clazz.newInstance();
        veterinarian = (Veterinarian) clazz.newInstance();

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animal.eat();

            veterinarian.treatAnimal(animal);
            System.out.println("-------------------------------");
        }

        //рефлексия вариант1 через clazz.getConstructor();
        Veterinarian veterinarian2 = null;
        try {
            Constructor constr = clazz.getConstructor(/*new Class[] {String.class}*/);
            Object obj = constr.newInstance(/*" Вася "*/);
            if (obj instanceof Veterinarian) {
                Veterinarian s = (Veterinarian) obj;
                System.out.println("veterinarian2" /*+ s.name*/);
                 s.treatAnimal(animals[0]);
            }


        } catch (Exception e){e.printStackTrace();}

    }


}
