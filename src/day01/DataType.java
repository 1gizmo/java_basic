package day01;

public class DataType {

    public static void main(String[] args) {
        // 10진수 1000 : 0011 1110 1000
        // 8bit == 1byte
        // 1024byte == 1kb
        // 동영상을 보낼때는 byte[] 단위로 쪼개서 보낸다

        int a = 100;
        /*
         1. 100을 메모리에 저장 (정수 리터럴 4바이트 할당)
         2. int a; 4바이트공간 할당 이름을 a 부여
         3. a = 100; 미리 저장된 100을 a에 복사
        */
        long money = 21474836470L;

        // 실수 리터럴은 기본 8바이트 할당
        // float 4바이트 : 다운캐스팅
        float f1 = 1.23456789F;
        System.out.println("f1 = " + f1);

        double d1 = 1.23412345123451;
        System.out.println("d1 = " + d1);

        // 논리타입
        boolean b1 = true;
        boolean b2 = false;

        // 문자 타입 : 한글자
        char c1 = 'A'; //65
        System.out.println((char)(c1 + 1));

        char c2 = 44032;
        System.out.println("c2 = " + c2);

        //기본타입이 아니라 객체다
        String s = "hello";

    }
}
