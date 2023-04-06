package day09.final_;

public class Main {
    public static void main(String[] args) {

        Person kim = new Person("김철수",
                "000111-3312114",
//                "대한민국",
                new BagPack(5, "샘소나이트"));

        kim.name = "김출수";
//        kim.ssn = "021114-23144577";
//        kim.bagPack = new BagPack(10,"기본");
    }
}
