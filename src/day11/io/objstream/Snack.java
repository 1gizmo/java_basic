package day11.io.objstream;

import java.io.Serializable;

public class Snack implements Serializable {

    // 객체를 직렬화해야 바이트스트림을 통과할 수 있다.
    public enum Taste {
        GOOD, BAD, SOSO;
    }


    private String snackName; // 과자이름
    private int year; // 출시연도
    private int price; // 가격
    private Taste taste; // 맛

    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }
}
