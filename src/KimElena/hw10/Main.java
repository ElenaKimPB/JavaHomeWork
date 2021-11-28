package KimElena.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox numBox = new NumBox<Float>(4);
        numBox.add(111);
        numBox.add(222);
        numBox.add(999);
        numBox.add(777);

        System.out.println("get - " + numBox.get(0));
        System.out.println("length - " + numBox.length());
        System.out.println("average - " + numBox.average());
        System.out.println("sum - " + numBox.sum());
        System.out.println("max - " +numBox.max());
    }
}
