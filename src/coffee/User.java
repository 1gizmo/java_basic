package coffee;

public class User {

    private int num;
    private String name;
    private String serialNum;
    private int money;

    public User() {
    }

    public User(int num, String name, String serialNum, int money) {
        this.num = num;
        this.name = name;
        this.serialNum = serialNum;
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 시리얼 넘버를 입력 후 로그인 했을때 유저 정보
    public String userInfo(){

        return String.format("안녕하세요 %s님 현재 잔액은 %d원 입니다",
                this.name, this.money);
    }

}
