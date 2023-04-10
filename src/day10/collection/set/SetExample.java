package day10.collection.set;
/*
*  - 집합 자료 구조
*  - 저장 순서를 보장하지 않음
*  - 인덱스 , 키를 사용하지 않아서 개별탐색이 불리함
*  - 값의 중복을 허용하지 않음
*
*
* */


import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<String> foodSet = new HashSet<>();

        // 데이터 추가 add ( E e )
        boolean flag2 = foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        boolean flag1 = foodSet.add("김말이");

        foodSet.add("김밥");

        System.out.println(foodSet.size());
        System.out.println(foodSet);

        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);

        for (String food : foodSet) {
            System.out.println("food = " + food);
        }

        // remove(day11.api.obj) : 삭제
        foodSet.remove("단무지");

        System.out.println("foodSet = " + foodSet);



        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,1,1,3,3,5,7,9,9)
        );
        // 리스트를 Set 으로 변환
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);
    }

}
