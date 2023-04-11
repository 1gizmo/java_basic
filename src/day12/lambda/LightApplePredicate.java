package day12.lambda;

public class LightApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= 100;
    }
}
