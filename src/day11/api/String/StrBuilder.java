package day11.api.String;

public class StrBuilder {
    private static void makeString() {

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 50000; i++) {
            s += "A";
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 총 소요 시간 : " + (end - start) + "밀리초");
    }

    private static void makeStringBuilder() {

        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 50000; i++) {
            s.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("빌더 총 소요 시간: " + (end - start) + "밀리초");
    }


    public static void main(String[] args) {

        makeStringBuilder();
        makeString();

        // 기본타입일땐 상속관계가 생기지 않지만 객체로 만들면 상속관계가 생김
//        int e;  초기값 0
//        Integer e;  초기값 null
        Integer a = 10; //오토박싱
        Character c = 'A';
        Byte b = 1;
        Double d = 11.1;


    }
}
