package day08.poly.book;

import day05.member.Gender;
import day07.protec.Util.Utility;

import java.util.Scanner;

import static day07.protec.Util.Utility.*;
import static day08.poly.book.RentStatus.*;

public class BookView {

//    private static Scanner sc;

    private static BookRepository br;

    //static 데이터는 생성자에서 초기화하면 안됨.
    // static 필드의 초기화는 static initializer 를 사용
    static {
//        System.out.println("정적 초기화자 호출!");
//        sc = new Scanner(System.in);
        br = new BookRepository();
    }

    // 회원정보를 입력처리
    private static void makeNewBookUser() {
        System.out.println("\n# 회원정보를 입력해주세요.");
        String name = input("#이름 : ");
        int age = Integer.parseInt(input("#나이 : "));

        Gender gender = inputGender();


        // 입력받은 데이터 객체로 포장
        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);

        //입력받은 유저객체를 저장소로 보내기
        br.register(userInfo);
    }

    // 정확하게 성별을 입력할때까지 반복 입력받는 메뉴
    private static Gender inputGender() {
        while (true) {
            String inputGander = input("#성별(M/F) : ");
            Gender gender;
            switch (inputGander.toUpperCase().charAt(0)) {
                case 'M':
//                gender = Gender.MALE;
                    return Gender.MALE;
                case 'F':
//                gender = Gender.FEMALE;
                    return Gender.FEMALE;
                default:
                    System.out.println("\n#성별을 잘못 입력했습니다");
            }
        }
    }

    //화면처리
    public static void start() {
        makeNewBookUser();
        // 메인 메뉴 띄우기
        while (true) {
            showMainScreen();

            selectMenu();
        }
    }


    //메뉴 번호를 입력받고 분기를 나눠주는 메서드
    private static void selectMenu() {
        String menuNum = input(">> 번호를 입력하세요 : ");
        switch (menuNum) {
            case "1":
                //마이페이지
                BookUser user = br.findBookUser();
                System.out.println("\n 내 정보");
                System.out.println("# 이름 :" + user.getName());
                System.out.println("# 나이 :" + user.getAge());
                System.out.println("# 성별 :" + user.getGenderToString());
                System.out.println("# 쿠폰 :" + user.getCouponCount());
                break;
            case "2":
                String[] infoList = br.getBookInfoList();
                System.out.println("======모든 도서 정보 ======");
                for (String info : infoList) {
                    System.out.println(info);
                }
                break;
            case "3":
                // 사용자에게 검색어를 입력받는다
                String keyword = input("# 검색어 : ");

                // 저장소에게 해당 검색어를 주면서 검색에 걸린 책 정보를 달라고 해야함

                String[] bookInfoList = br.searchBookInfoList(keyword);
                if (bookInfoList.length > 0) {
                    System.out.printf("\n======== [%s] 검색 결과 =========\n", keyword);
                    for (String info : bookInfoList) {
                        System.out.println(info);
                    }
                }else {
                    System.out.println("#검색 결과가 없습니다");
                }

                break;
            case "4":
                    // 대여 가능한 책의 목록을 번호와 함께 출력
                String[] rentalList = br.getBookInfoList();
                System.out.println("======대여 가능한 도서 정보 ======");
                int bookNum = 1;
                for (String info : rentalList) {
                    System.out.printf("%d. %s\n", bookNum++, info);
                }
                String rentNum = input("- 대여할 도서 번호 입력 : ");
                RentStatus rentStatus = br.rentBook(Integer.parseInt(rentNum));
                if (rentStatus == RENT_SUCCESS_WITH_COUPON) {
                    System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
                } else if (rentStatus == RENT_SUCCESS) {
                    System.out.println("# 도서가 성공적으로 대여되었습니다.");
                } else {
                    System.out.println("# 도서 대여에 실패했습니다.");
                }
                break;
            case "5":
                break;
            case "9":
                System.out.println("프로그램을 종료합니다");
                System.exit(0);
                break;
            default:
                System.out.println("\n숫자를 제대로 입력해주세요");
        }
    }

    //메인 메뉴창을 출력하는 메서드
    private static void showMainScreen() {
        System.out.println("==================도서 메뉴===================");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }

}
