package KimElena.hw7;

public abstract class Clothes {
    Size size;
    String color;
    float cost;

    public Clothes() {
    }

    public Clothes(Size size, String color, float cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }
}
