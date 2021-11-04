package KimElena.hw6;

public class Animal {

    private String food;
    private String location;

    public void makeNoise() {
        System.out.println(" шумит");
    }
    public void eat() {
        System.out.println(" ест");
    }
    public void sleep() {
        System.out.println(" спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
