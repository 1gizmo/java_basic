package day10.generic;

public class Basket<F> {

    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
//
//    public Fruit getFruit() {
//        return (Fruit) fruit;
//    }
//
//    public void setFruit(Fruit fruit) {
//        this.fruit = (F) fruit;
//    }
}
