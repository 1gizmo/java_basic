package day03;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제전: "
                                + Arrays.toString(arr));
        int delIndex = 1;
        for (int i =delIndex; i< arr.length -1; i++){
        arr[i] = arr[i + 1];
        };

        // pop
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;

        /* arr[1] = arr[2];
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5]; */
        System.out.println("삭제후: "
                                +Arrays.toString(arr));

    }
}
