package day13;

import day07.protec.Util.Utility;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day07.protec.Util.Utility.*;
import static day13.Menu.*;

public class Mapping {
    public static void main(String[] args) {

        // stream의 map : 리스트에서 원하는 정보만 추출

        // 메뉴 목록에서 요리의 이름들만 목록으로 추출

        List<String> dishNames = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println("dishNames = " + dishNames);

        //
        makeLine();
        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> wordLengths = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println("wordLengths = " + wordLengths);  // 6 6 7 5 7


        makeLine();
        // 메뉴 목록에서 메뉴이름과 칼로리를 추출하는데
        // 칼로리를 정수가 아닌 문자열로 kcal을 뒤에 붙여서 추출 후
        // 메뉴이름: xxxkcal 로 반복 출력하고 싶음
        List<SimpleDish> simpleDishes = menuList.stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList());
        simpleDishes.forEach(sd -> System.out.println(sd));

        /*
        *  메뉴 목록에서 칼로리가 500 칼로리보다 큰 음식들을 핉터링한 다음에
        * 그 음식의 이름과 타입만 추출해서 출력해주세요
        * */
        makeLine();
        List<nameType> nameTypes = menuList.stream()
                .filter(Dish -> Dish.getCalories() > 500)
                .limit(3)
                .map(dish -> new nameType(dish))
                .collect(Collectors.toList());
        nameTypes.forEach(nameType -> System.out.println("nameType = " + nameType));


        makeLine();
        int totalCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("totalCal = " + totalCal);


        makeLine();
        double averageCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        System.out.println("averageCal = " + averageCal);

    }

}
