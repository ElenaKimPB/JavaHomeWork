package KimElena.hw7;

public class Tshirt extends Clothes implements ManClothes,WomenClothes {
    @Override
    public void dressMan() {
        System.out.println("футболка");
    }

    @Override
    public void dressWomen() {
        System.out.println("футболка");
    }

//    String tshirt = "футболка";
}
