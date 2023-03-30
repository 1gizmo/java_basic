package day04;

public class FieldAndLocal {
    int a; // a:  필드

    double[] b;
    void mm(int b){ // b: 매개변수
     int c; // c: 지역변수

        if(a > 10){
            c = 99;
        } else if (a < 5) {
            c = -100;
        }else {                     //  else 가 없으면 오류, 지역변수는 무조건 값이 지정되야함
            c = 55;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }




}
