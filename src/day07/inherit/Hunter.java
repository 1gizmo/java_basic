package day07.inherit;

public class Hunter extends Player{


    int concentration; // 집중력

    public Hunter(String nickName) {
        super(nickName);
        this.concentration = 100;
    }

    // 캐릭터 상태창을 보는 기능


    public void summonBeast() {
        System.out.println("야수 소환");
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concenteration: "+this.concentration);
    }
}