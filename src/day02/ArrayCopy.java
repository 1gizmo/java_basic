package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        // 배열 복사 알고리즘
        // String[] pets = new String[]{"멍멍이","야옹이","짹짹이"};

        // 선언과 동시에 초기화 한다면 new Type[] 생략가능
        // 변수에 담을때만 사용가능하고 이외의 상황에는 사용 불가
//        String[] pets = {"멍멍이", "야옹이", "짹짹이"};


//        for (String p : new String[] {"멍멍이", "야옹이", "짹짹이"} ){}

        String[] pets = {"멍멍이", "야옹이", "짹짹이"};
//        String[] petsCopy = pets;


        // 1. 원본과 동일 사이즈의 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];

        // 2. 원본의 각 인덱스값들을 사본에 인덱스로 일일히 복사
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] =  pets[i];
        }
//        petsCopy[0] = pets[0];
//        petsCopy[1] = pets[1];
//        petsCopy[2] = pets[2];
        pets[1] = "사마귀";
        System.out.println("원본주소: " + pets);
        System.out.println("사본주소: " + petsCopy);


        System.out.println("원본배열:" + Arrays.toString(pets));
        System.out.println("사본배열:" + Arrays.toString(petsCopy));


    }
}
