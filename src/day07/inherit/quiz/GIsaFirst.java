package day07.inherit.quiz;

public class GIsaFirst {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        System.out.print(obj.compute(4));
    }
}

class Parent1 {
    int compute(int num) {
        if( num <= 1) return num;
        return compute(num-1) + compute(num-2);
    }
}

class Child1 extends Parent1 {
    int compute(int num) {
        if( num <= 1) return num;
        return compute(num-1) + compute(num-3);
    }
}

