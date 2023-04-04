package day07.inherit;

// 서브 클래스 ( 자식 클래스 )
public class Warrior extends Player{
    public Warrior() {
        this("이름없음");
    }

    int rage; // 분노게이지

    public Warrior(String nickName) {
        super(nickName);
        this.rage = 20;
    }

    // 파워슬래시
    public void powerSlash() {
        System.out.println("파워슬래시를 시전합니다.");
    }
    // 오버라이딩
    // 조건 : 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용
    // 접근 제한자는 무조건 부모보다 public 해야 함.
    // ctrl + o , ait + insert 단축키
    @Override  // 오버라이딩 검사
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage: "+this.rage);
    }


}