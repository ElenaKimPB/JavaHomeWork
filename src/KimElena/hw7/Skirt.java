package KimElena.hw7;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt() {
    }

    public Skirt(Size size, String color, float cost) {
        super(size, color, cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("юбка");
    }
}
