package day09.abs;

public class Dog extends Pet {

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void eat(){
        System.out.println("강아지는 사료를 먹어요");
    }
    public void takeNap(){
        System.out.println("강아지는 낮잠을 자요");
    }
    public void wlak(){

    }
}
