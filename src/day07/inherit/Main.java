package day07.inherit;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("충격왕쇼킹");
        Hunter h = new Hunter("욕설왕퍼킹");



//        w.showStatus();
//        m.showStatus();
//        h.showStatus();

        Player[] players = {
                w, m, h,
                new Warrior("요리왕쿠킹")
        };

        m.thunderBolt(w,h, new Warrior("토끼곤듀"));




    }


}
