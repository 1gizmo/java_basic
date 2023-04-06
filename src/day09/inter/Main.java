package day09.inter;

public class Main {
    public static void main(String[] args) {

        BullDog bullDog = new BullDog();

        bullDog.hunt();
        bullDog.violent();
        bullDog.eat();

        Duck duck = new Duck();
        duck.eat();

        Rabbit rabbit = new Rabbit();
        rabbit.violent();

        // 인터페이스는 다형성을 구현하는 역활
        // 인터페이스도 부모타입으로 사용이 가능
        Pet[] pets = {
                bullDog,
                duck,
                new Rabbit()
        };
        for (Pet pet : pets) {
            pet.eat();
        }


    }
}
