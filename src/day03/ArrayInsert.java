package day03;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // 20이랑 30 사이에 넣고 싶음
        int newData = 25; // 2번 index에 넣어야 함
        int targetIndex = 2;
        // 1. 배열의 사이즈를 먼저 1 늘린다
        int[] temp = new int [arr.length + 1];

        // 2. 늘린 배열에 원본 배열을 다 복사한다
        for (int i = 0; i < arr.length ; i++) {
            temp[i] = arr[i];
        }
        // 3. 맨 뒤부터 타겟 인덱스까지 한칸씩 뒤로 민다
       for (int i = temp.length -1; i > targetIndex; i--) {
        temp[i] = temp[i-1];
        }
        temp[targetIndex] = newData;
       arr = temp; temp = null;
        System.out.println(Arrays.toString(arr));
    }
}
  /*
        // 3. 맨 뒤부터 타겟인덱스까지 한칸씩 뒤로 민다.

        for (int i = temp.length - 1; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }

        *//*temp[5] = temp[4];
        temp[4] = temp[3];
        temp[3] = temp[2];*//*

        // 4. 타겟인덱스 자리에 새 데이터를 넣는다.
        temp[targetIndex] = newData;
        // 5. 주소를 바꾼다.
        arr = temp; temp = null;

        System.out.println("추가후: " + Arrays.toString(arr));

    }
}*/