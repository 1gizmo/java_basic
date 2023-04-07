package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {

    // 정수를 입력 받아서 리턴하는 메서드
    public int inputNumber() throws InputMismatchException, NullPointerException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    };
  // 문자열 정수로 변환하는 기능
    public int convert(String s) throws NumberFormatException{
        int n = Integer.parseInt(s);
        return n;
    }

    public void convertAndInput() {
        try {
            int n = inputNumber();
            int m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수입력잘해주세여");
        } catch (NumberFormatException e) {
            System.out.println("숫자변환 못해");
        }
    }


}
