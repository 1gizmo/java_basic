package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int korScore = 10;
        int matScore = 20;
        int engScore = 30;

        int[] kimScore = {korScore, matScore, engScore};
        int[] parkScore = {100, 34, 99};
        int[] hongScore = {10, 100, 11};

        // 2차원 배열
        int[][] classScore = {kimScore, parkScore, hongScore};

        System.out.println(classScore[0][0]);
        System.out.println(kimScore[0]);

        System.out.println(Arrays.toString(classScore));
        System.out.println(classScore[1]);
        System.out.println(parkScore);

        // deepToString : 2차원배열 주소가 아니라 값을 보여줌
        System.out.println(Arrays.deepToString(classScore));

        int[][] arr2d = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 200, 300}
        };
        System.out.println("===============================");
        System.out.println(arr2d[0][2]);

        int[] arr3 = arr2d[2];

        // 2차원 배열의 순회
        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
        // 배열의 기본값
        // 정수 배열은 0이 기본 값 , 실수는 0.0이 기본 값
        // 논리는 거짓이 기본, char 배열은 기본값 공백
        // 그 나머지는 전부 null이 기본

        int[] numbers = new int[5];
        System.out.println("==============");
        System.out.println(Arrays.toString(numbers));

        // 2차원 배열의 수정

        //array2d 2행 4열 값 수정

        // 5행 4열의 정수 2차원 배열을 생성만 하고 싶다
        int[][] array2d = new int[5][4];
        array2d[1][3] = 99;
        array2d[2][1] = 55;
        array2d[3] = new int [] {9, 8, 7, 6};
        System.out.println("======================");
        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }
        // 3차원 배열
       int arr3d[][][] = {
                {
                        {10, 20},
                        {30, 40}
                },
                {
                        {50, 60},
                        {70, 80}
                },
                {
                        {90, 100},
                        {200, 300}
                }
        };
        System.out.println(arr3d[1][0][1]);
        System.out.println(Arrays.deepToString(arr3d));

    }
}
