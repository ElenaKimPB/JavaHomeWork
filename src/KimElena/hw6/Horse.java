package KimElena.hw6;

import java.util.Objects;

public class Horse extends Animal {
    String type = "лошадь";

    public Horse() {
        super.setFood("овес");
        super.setLocation("хлев");
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
