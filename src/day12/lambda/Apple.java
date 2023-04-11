package day12.lambda;

import java.util.Objects;

public class Apple {

    private int weight; // 무게
    private Color color; // 색상
    // final 이면 setter getter  못 만듬
    public Apple() {  // NoArgs : 인자가 없다
    }

    public Apple(int weight, Color color) { // AllArgs : 모든 인자
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }
}
