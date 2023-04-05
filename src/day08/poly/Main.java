package day08.poly;

public class Main {
    public static void main(String[] args) {


        // 객체는 항상 역활에 의존해야지 구현체에 의존하면 안됨
        Computer com = new Computer();

        LgMonitor lgMonitor = new LgMonitor();
        com.Monitor = lgMonitor;

        // 모니터 교환
        com.Monitor = new HpMonitor();
        com.Monitor = new LgMonitor();



    }
}
