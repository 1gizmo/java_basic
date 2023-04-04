package day07.static_;

import day07.protec.Util.Utility;

import javax.swing.text.Utilities;

public class Calculator {

    String color; // 계산기 색상
   static double pi; //원주율


    // 원의 넓이를 구하는 메서드
    static double calcAreaCircle(int r){
        return pi * r * r;
    }
    // 계산기에 색칠을 예쁘게 칠하는 기능
    void paint(String color){
        this.color = color;
    }


}
