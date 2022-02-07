package two;

public class Level {

    private int level;

    public Level() {
        this.level = 0;
    }

    public void up() {
        this.level += 1;
    }

    public int getDamage() {
        return (int) (Math.random() * (this.level + 1 - 1)) + 1;
    }

    public int getHeal() {
        return (int) (Math.random() * (this.level + 1 - 1)) + 1;
    }

}
