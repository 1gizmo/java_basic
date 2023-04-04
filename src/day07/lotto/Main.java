package day07.lotto;

import java.util.Arrays;
import day07.lotto.Lotto.*;


public class Main  {

    public static void main(String[] args) {

/*        int [] mumber = new int [6];
        for (int i = 0; i < mumber.length ; i++) {
            mumber[i] = (int) (Math.random()*45)+1;
        }
        System.out.println("mumber = " + Arrays.toString(mumber));*/

//        Lotto.information();
        LottoSimulator.run();
    }
}
