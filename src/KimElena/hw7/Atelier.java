package KimElena.hw7;

import KimElena.hw6.*;

public class Atelier {
       public static void main(String[] args) {

        Clothes tshirt = new Tshirt();
        tshirt.color = "черные";
        tshirt.cost = 10.5F;
        tshirt.size = Size.M;

        Clothes pants = new Pants(Size.S, "коричневая", 25.5F);

        Clothes skirt = new Skirt(Size.L, "бежевая", 20F);

        Clothes tie = new Tie(Size.XXS, "синий", 0.5F);

        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
           dressMan(clothes);
           dressWomen (clothes);

    }

    static void dressMan(Clothes[] clothes) {
        System.out.println("------------------------------");
        System.out.println("Мужская одежда");
        System.out.println("------------------------------");
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
                System.out.println(c.size +" ("+ c.size.getDescription() +"-"+ c.size.getEuroSize() +") "+ c.color +" "+ c.cost);
            }
        }

    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println("------------------------------");
        System.out.println("Женская одежда");
        System.out.println("------------------------------");
        for (Clothes w : clothes) {
            if (w instanceof WomenClothes) {
                ((WomenClothes) w).dressWomen();
                System.out.println(w.size +" ("+ w.size.getDescription() +"-"+ w.size.getEuroSize() +") "+ w.color +" "+ w.cost);
            }
        }

    }
}

