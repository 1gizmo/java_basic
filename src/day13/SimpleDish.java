package day13;

import day07.protec.pac2.D;

import java.util.Objects;

// 요리 정보중 이름과 칼로리만 관리하는 객체
public class SimpleDish {

    private final String name;
    private final String calories;

    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories() + "kcal";
    }

    public SimpleDish(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleDish that = (SimpleDish) o;
        return Objects.equals(name, that.name) && Objects.equals(calories, that.calories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories);
    }
}
