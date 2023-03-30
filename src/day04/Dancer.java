package day04;

//댄서의 설계도
//설계도에는 main을 만들지 않는다.

public class Dancer {

    //속성 (필드)
    String dancerName; //댄서이름

    String crewName; //크루 이름

    String genre; // 춤 장르

    int level; // 춤 수준 ( 0: 초보자, 1: 중수, 2:고수 )

    // 생성자 : 스카우터, 개발자(공돌이), 기술자
    // 생성자도 함수개념 , 리턴이 주소 값 타입으로 고정
    // 리턴값은 생성한 객체의 주소값을 리턴
    // 객체 생성시 필요한 데이터를 셋팅
    Dancer() {
        dancerName = "갑돌이";
        crewName = "돌아이들";
        genre = "아이돌댄스";
        level = 1;
    }
    // 생성자 오버로딩
    Dancer(String dgenre) {
        dancerName = "관종킹";
        crewName = "서커스왕";
        genre = dgenre;
        DanceLevel level1 = DanceLevel.BEGINNER;
    }
    Dancer(String dName, String dGenre, int dLevel){
        dancerName = dName;
        crewName = "하하호호";
        genre = dGenre;
        level = dLevel;
    }


    // 기능 ( 메서드 ) : static 을 붙이지 마시요
    // 춤추는 기능:
    void dance() {
        System.out.println(genre+"춤을 열정적으로 춥니다.");
    }
    // 스트레칭을 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다.");
    }
    // 자기소개
    String introduce() {
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.", dancerName, crewName);
    }

}
