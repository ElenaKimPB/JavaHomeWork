package KimElena.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes {
    public Pants(Size size, String color, float cost) {
        super(size, color, cost);
    }

    @Override
    public void dressMan() {
        System.out.println("штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("штаны");
    }
}
