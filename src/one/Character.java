package one;

public class Character {

    private int level;
    private int hp;
    private boolean dead;

    public Character() {
        this.level = 1;
        this.hp = 100;
        this.dead = false;
    }

    public void heal(Character target, int hp) throws Exception {
        if (this.equals(target)) {
            throw new Exception("one.Character can't heal himself.");
        }

        target.getHeal(hp);
    }

    public void attack(Character target, int damage) throws Exception {
        if (this.equals(target)) {
            throw new Exception("one.Character can't attack himself.");
        }

        target.getDamage(damage);
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else {
            this.hp = 0;
            this.dead = true;
        }
    }

    public void getHeal(int hp) throws Exception {
        if (this.dead) {
            throw new Exception("Dead character can't be heal");
        } else if (this.hp + hp > 100) {
            this.hp = 100;
        } else {
            this.hp += hp;
        }
    }

    @Override
    public String toString() {
        return "level => " + level + " / hp => " + hp + " / isDead => " + dead;
    }
}
