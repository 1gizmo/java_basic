package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myName = "홍길동";
        String inputName = sc.nextLine();

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        if(myName.equals(inputName)){
            System.out.println("두 이름이 일치함");
        }else {
            System.out.println("두 이름이 일치하지 않음!");
        }


    }

}
