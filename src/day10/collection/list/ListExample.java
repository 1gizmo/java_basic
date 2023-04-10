package day10.collection.list;
/*
 *   - 저장 데이터의 순서를 보장한다
 *   - 인덱스를 가지고 있음
 *   - 중복 데이터를 저장 가능
 *   -
 */

import day07.protec.Util.Utility;

import java.util.*;

import static day07.protec.Util.Utility.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> foodList = new ArrayList<>();

//        add (E e) : 배열 맨끝 추가
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("닭강정");
        foodList.add("부대찌개");
        foodList.add("참치찌개");

        // add(index , element) : 배열 중간 삽입
        foodList.add(2,"족발");

        // size() : 저장된 데이터 개수를 반환
        int size = foodList.size();
        System.out.println("size = " + size);

        System.out.println(foodList);

//        indexOf(E e) : 해당 데이터의 인덱스 반환
        int index = foodList.indexOf("파스타");
        System.out.println("index = " + index);

//        contains(E e) : 해당 데이터 저장 유무 확인
        System.out.println(foodList.contains("짜장면")); // true
        System.out.println(foodList.contains("마파두부")); //false

//        remove(index), remove(day11.api.obj)
        String removeFood = foodList.remove(1);
//        foodList.remove(1);
        foodList.remove("파스타");

        System.out.println("foodList = " + foodList);

//        set(index, newElement) : 수정
        foodList.set(0, "깐풍기");
        System.out.println("foodList = " + foodList);

        // get(index) : 리스트에 저장된 데이터 참조
        String s = foodList.get(1);
        System.out.println("s = " + s);

        // 반복문 처리
        makeLine();
        for (int i = 0; i < foodList.size() ; i++) {
            System.out.println(foodList.get(i));
        }
        makeLine();
        for (String food : foodList) {  // food = 배열객체~
            System.out.println("food = " + food);
        }

        // clear() : 내부 데이터 전체삭제
        foodList.clear(); // 배열 비워줘 ~
        System.out.println("foodList = " + foodList);
        System.out.println(foodList.isEmpty()); //비어있니

        // 리스트에 초기 값 넣고 시작하기
        List<String> tvxq = new ArrayList<>(
                Arrays.asList(    //배열에 값 넣기
                        "유노윤호",
                        "최강창민"
                )
        );
        System.out.println("tvxq = " + tvxq);

        // 정렬 ( 듀얼 피벗 퀵 정렬 )
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(
                        5,
                        30,
                        17,
                        9,
                        52,
                        41
                )
        );
        makeLine();
        System.out.println("numbers = " + numbers);

        // 오름차 정렬
        Collections.sort(numbers);

        System.out.println("numbers = " + numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());

        System.out.println("numbers = " + numbers);


    }
}
