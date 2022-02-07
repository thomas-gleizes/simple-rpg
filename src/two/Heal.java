package two;

public class Heal {

    private int point;

    private static final int MAX_HEAL_POINT = 1000;

    public Heal() {
        this.point = 10;
    }

    public void takeDamage(int damage) {
        this.point -= damage;

    }

    public void takeHeal(int point) {
        if (this.point + point > MAX_HEAL_POINT) {
            this.point = 1000;
            return;
        }

        this.point += point;
        return;
    }

    public boolean haveHp() {
        return this.point >= 0;
    }

}
