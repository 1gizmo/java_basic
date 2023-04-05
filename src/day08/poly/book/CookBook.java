package day08.poly.book;

public class CookBook extends Book{

    private boolean coupon; // 요리학원 쿠폰 유무

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }


    // boolean 타입은 get 이 아니라 is ( 관례상 )
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String info() {
        return String.format("#분류 : 만화책, %s, 쿠폰유무: %b", super.info(), coupon ? "없음" : "있음");
    }
}
