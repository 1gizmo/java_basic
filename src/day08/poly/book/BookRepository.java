package day08.poly.book;

import day04.array.StringList;
import day07.protec.pac1.B;

import static day08.poly.book.RentStatus.*;

public class BookRepository {


    // 회원 1명
    private static BookUser BookUser;

    // 유저를 등록하는 기능
    public void register(BookUser userInfo) {
        BookUser = userInfo;
    }


    // 도서들의 정보
    private static Book[] bookList;

    static {

        bookList = new Book[]{
                new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }

    //마이페이지 기능
    /*
     여기에 있는 bookUser 정보 리턴
    */
    BookUser findBookUser() {
        return BookUser;
    }

    // 모든 책의 정보를 알려주는 메서드
    public String[] getBookInfoList() {
        String[] infoList = new String[bookList.length];
        for (int i = 0; i < infoList.length; i++) {
            infoList[i] = bookList[i].info();
        }
        return infoList;
    }

    ;

    // 검색어를 받으면 해당 검색어를 포함하는 제목을 가진 책 정보들을 반환
    public String[] searchBookInfoList(String keyword) {
        StringList list = new StringList();
        // bookList 를 뒤져서 찾아야 함
        for (Book book : bookList) {
            String title = book.getTitle(); // 한권 한권 책의 제목들
            if (title.contains(keyword)) {
                // 검색어에 걸린 책 제목들 정보 문자열
                String info = book.info();
                list.push(info);

            }
        }
        return list.getsArr();
    }

    // 대여 가능한 도서 목록들을 반환
    public String[] getuserBookList() {
        String[] userBook = new String[bookList.length];
        for (int i = 0; i < bookList.length; i++) {
            userBook[i] = bookList[i].info();
        }
        return userBook;
    }

    //도서 대여 처리
    public RentStatus rentBook(int rentNum) {
        // 대여를 원하는 책 추출
        Book wishBook = bookList[rentNum - 1];

        //책의 분류에 따라서 다른 처리를 해야함
        if (wishBook instanceof CookBook) {
           CookBook cookBook = (CookBook) wishBook;  // 다운그레이드
            // 쿠폰 유무 확인
            if(cookBook.isCoupon()){
                BookUser.setCouponCount(BookUser.getCouponCount()+1);
                return RENT_SUCCESS_WITH_COUPON;
            }else {
                return RENT_SUCCESS;
            }
        } else if (wishBook instanceof CartoonBook) {
            CartoonBook cartoonBook = (CartoonBook) wishBook; // 다운그레이드
            // 연령 제한 확인
            if(BookUser.getAge() >= cartoonBook.getAccessAge()){
                //빌릴 수 있는 경우
                return RENT_SUCCESS;
            }else{
                return  RENT_FAIL;
            }
        }
        return RENT_FAIL;

    }


}




