package day07.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

static int [] number = new int[6];

public static void loottoNumber () {
    for (int i = 0; i < number.length ; i++) {
          int trump = (int) (Math.random()*45)+1;
        number[i] = trump;
//        for (int j = 0; j <number.length ; j++) {
//            if(number[i]==number[j]){
//                i--;
//                break;
//            }
        }
        System.out.println(" = " + Arrays.toString(number));
    }

    private static void makeLotto() {
        int i = 0;
        while (i < lotto.length) {
            // 1 ~ 45 범위의 랜덤정수
            int rn = (int) (Math.random() * 45 + 1);
            if (!isDuplicate(lotto, rn)) { // 만약 중복숫자가 아니라면
                lotto[i] = rn;
                i++;
            }
        }
    }

    protected static boolean isDuplicate(int[] targetLotto, int rn) {
        for (int n : targetLotto) {
            if (rn == n) return true;
        }
        return false;
    }

    public static void information() {
        makeLotto();
        System.out.println(Arrays.toString(number));
    }

    protected static int[] getLotto() {
        makeLotto();
        return number;
    }

 static Scanner sc = new Scanner(System.in);
    public static String input(){
        String inputnumber;
        System.out.println("구매번호를 차례대로 입력하세요");
        inputnumber = sc.nextLine();
        return input();
    }
}
