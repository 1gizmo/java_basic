package day11.api.obj;

import day11.api.obj.Pen;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Pen p1 = new Pen(123, "빨강", 1000);
        p1.company = new Company("모나미", "서울");

        Pen p2 = new Pen(123, "빨강", 1000);

        System.out.println(p1);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(2));

        Set<Pen> penSet = new HashSet<>();
        penSet.add(p1);
        penSet.add(p2);

        System.out.println(penSet.size());
        System.out.println(penSet);

        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(Integer.toHexString(p2.hashCode()));
    }
}
