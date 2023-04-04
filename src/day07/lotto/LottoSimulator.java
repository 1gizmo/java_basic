package day07.lotto;

import day07.util.Utility;

import java.util.Arrays;

public class LottoSimulator {

    private static int[] makeMyLotto() {
        // 나의 번호
        System.out.println("구매번호를 6개 차례대로 입력하세요.");
        int[] myLotto = new int[6];

        int i = 0;
        while (i < myLotto.length){
            int number = Integer.parseInt(Utility.input(String.format("%d번째 번호 >> ", i+1)));

            if (!Lotto.isDuplicate(myLotto, number)) {
                myLotto[i] = number;
                i++;
            } else {
                System.out.println("# 중복번호입니다.");
            }
        }

        return myLotto;
    }

    public static int checkLotto(int[] winNumbers, int[] myLotto) {
        int count = 0 ;  // 일치한 숫자의 수
        for (int n : winNumbers) {
            for (int m : myLotto) {
                if (m == n) count++;
            }
        }
        return count;
    }

    public static void run() {
        // 1등 당첨번호
        int[] winNumbers = makeMyLotto();

        int paper = 0; // 구매한 장수
        while (true) {
            int[] purchasedLottoNumbers = Lotto.getLotto();
            paper++;

            int count = checkLotto(winNumbers, purchasedLottoNumbers);

            if (count == 6) {
                System.out.printf("# %d장만에 1등에 당첨되었습니다. ㅊㅋㅊㅋ\n", paper);
                break;
            } else {
                System.out.printf("# %d장째 구매중... ㅠㅠ\n", paper);
            }
        }
    }
}