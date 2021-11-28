package KimElena.hw10;

public class NumBox <T extends Number & Comparable<? super T>> {

    private int size;

    private T[] number;

    public NumBox(int len) {
        this.number = (T[]) new Number[len];
    }

    public void add(T num) {

        for (int i = 0; i < this.number.length; i++) {
            if(size>=this.number.length){
                throw new ArrayIndexOutOfBoundsException();
            }

            if (this.number[i]!=null){
                continue;
            }

            if (this.number[i]==null) {
                size++;
                this.number[i] = num;
                break;
            }
        }
    }

    public int length() {
        return size;
    }

    public T get(int index) {
        if (index >= number.length) {
            System.out.println("максимальный индекс = " + (size - 1));
            return this.number[size - 1];
        } else {
            return this.number[index];
        }

    }

    public double average() {
        Double sum = 0.0;
        for (int i = 0; i < this.number.length; i++) {
            if (this.number[i] != null) {
                sum = sum + Double.parseDouble(number[i].toString());
            }
        }
        return sum / size;
    }
    public double sum() {
        Double sum = 0.0;
        for (int i = 0; i < this.number.length; i++){
            if (this.number[i] != null) {
                sum = sum + Double.parseDouble(number[i].toString());
            }
        }
        return sum;
    }
    public T max() {
        if (size > 0) {
            T maxElem = number[0];

            for (int i = 0; i < size; i++) {
                if (maxElem.compareTo(number[i]) < 0)
                    maxElem = number[i];
            }
            return maxElem;
        } else {
            throw new NullPointerException();
        }
    }
}