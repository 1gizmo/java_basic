package day09.abs;

public class Main {
    public static void main(String[] args) {

        Pet[] pets = {
                new Dog("해피","푸들",2),
                new Dog("초코","시츄",3),
                new Dog("최강","불독",4),
                new Cat("꾸꾸까까","러시안블루",2)
        };
            new Pet("그냥동물","그냥종",11);
        for (Pet pet : pets) {
            pet.takeNap();
        }
    }
}
