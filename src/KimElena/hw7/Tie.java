package KimElena.hw7;

public class Tie extends  Clothes implements ManClothes{

    public Tie(Size size, String color, float cost) {
        super(size, color, cost);
    }

    @Override
    public void dressMan() {
        System.out.println("галстук");
    }

}
