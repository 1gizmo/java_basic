package day12.lambda;

// 사과를 필터링할 추상적 명세서
@FunctionalInterface
public interface ApplePredicate {

    // 사과를 받으면 조건에 맞게 검사해서 논리값을 반환
    boolean test(Apple apple);
}
