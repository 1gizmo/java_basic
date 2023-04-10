package day11.api.system;

import java.util.Arrays;

public class SystemExample {

    public static void main(String[] args) {

        // 운영체제의 현재 시간 읽기
        long time = System.currentTimeMillis();
        System.out.println("time = " + time);

        // 코드
        long time2 = System.currentTimeMillis();

        // 배열 카피
        int[] arr = {10, 20, 30};
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);

        System.out.println(Arrays.toString(copyArr));
    }
}
