package day07.inherit;

// 슈퍼 클래스 ( 부모 클래스 ) : 객체의 공통 기능과 속성을 설계
public class Player {

    String nickName; // 캐릭터 이름
    int level;
    int hp;
    int exp;
    // 부모의 생성자


    public Player(String nickName) {
        System.out.println("Player의 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);

    }


}
