package day07.inherit;

public class Mage extends Player {


    int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    // 썬더볼트
    public void thunderBolt(Player... targets) {
        System.out.printf("# %s님 썬더볼트 시전!!!!\n", this.nickName);
        System.out.println("======================================");


        for (Player p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.nickName, damage, p.hp);
        }
    }


    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + this.mana);
    }
}