package day07.lotto;

import java.util.Arrays;

public class Lotto {

    private static int[] lotto = new int[6];


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
        System.out.println(Arrays.toString(lotto));
    }

    protected static int[] getLotto() {
        makeLotto();
        return lotto;
    }
}