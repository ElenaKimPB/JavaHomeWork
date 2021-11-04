package KimElena.hw6;

import java.util.Objects;

public class Dog extends Animal{
    String type = "собака";

    public Dog() {
        super.setFood("косточку");
        super.setLocation("будка");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(type, dog.type);
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
