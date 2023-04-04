package day07.static_;

import day07.protec.Util.Utility;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(Count.x);
        System.out.println(Math.random());

        Count.m1();


        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2();

        Count.x = 10;
        c2.y = 20;

        Count.x++;

        System.out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        System.out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);

        Calculator cal1 = new Calculator(); // kim
        Calculator cal2 = new Calculator(); // park

        cal1.color = "빨강";
        cal2.color = "초록";

        System.out.println("cal1 = " + cal1.color);
        Calculator sharp = new Calculator();


        Calculator.calcAreaCircle(5);
        System.out.println("cal2. = " + cal2);

        Utility.makeLine();
      Utility.input("하하호호");

    }


}
