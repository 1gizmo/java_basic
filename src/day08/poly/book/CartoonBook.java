package day08.poly.book;

public class CartoonBook extends Book {

    private int accessAge; // 나이제한

    public CartoonBook() {}

    public CartoonBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String info() {
        return String.format("# 분류: 만화책, %s, 연령제한: %d세", super.info(), accessAge);
    }
}
