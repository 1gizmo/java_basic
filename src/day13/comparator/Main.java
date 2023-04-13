package day13.comparator;

import day06.modi.pac1.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
        List.of(
                new Student("송철수", 15, 79),
                new Student("이두박", 17, 39),
                new Student("김흥박", 11, 99),
                new Student("수철송", 25, 19)
        ));
        // List.of 생성하면 값 추가 수정 불가임, 그래서 ArrayList로 생성하고
        //안에서 생성

        // 나이순으로 오름차순 정렬 ( 나이 적은순 )
        studentList.sort((o1, o2) -> o1.getScore() - o2.getScore());


        // 이름 가나다순으로 오름차 정렬
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        studentList.forEach(s -> System.out.println(s));


    }
}
