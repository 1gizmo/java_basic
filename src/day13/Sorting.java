package day13;

import day07.protec.Util.Utility;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.protec.Util.Utility.*;
import static day13.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // stream 정렬 sorted

        // 메뉴 목록중 칼로리가 낮은 순으로 정렬

        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        makeLine();
        // 메뉴 목록중 이름으로 내림차 정렬 (zyx순) reversed() 내림차정렬
        menuList.stream()
                .sorted(comparing(Dish::getName).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);

        makeLine();
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(comparing(Dish::getName).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);

    }
}
