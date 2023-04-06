package day09.quiz;

public class Main {
    public static void main(String[] args) {

        SmartPhone[] smartPhones = {
                new Galaxy("삼성"),
                new IPhone("애플")
        };
        for (SmartPhone smartPhone : smartPhones) {
            String message = smartPhone.information();
            System.out.println(message);
        }
    }
}
