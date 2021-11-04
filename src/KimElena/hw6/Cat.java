package KimElena.hw6;

import java.util.Objects;

public class Cat extends Animal {
    String type = "кошка";

    public Cat() {
        super.setFood("Вискас");
        super.setLocation("Подоконник");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(type, cat.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
    @Override
    public void makeNoise() {
        System.out.println(this.type + " шумит ");
    }

    @Override
    public void eat() {
        System.out.println(this.type + " ест " + super.getFood());
    }
}
