package two;

public class Character {

    private Heal hp;
    private Level level;

    public Character() {
        this.hp = new Heal();
        this.level = new Level();
    }

    public boolean isAlive() {
        return this.hp.haveHp();
    }

    public void attack(Character target) throws Exception {
        if (this.equals(target))
            throw new Exception("fait pas le maso");

        if (this.isAlive())
            throw new Exception("tes mort tu attaque pas noob");

        if (target.isAlive())
            throw new Exception("Arrête d'tapéoe un cadavre");


        target.receiveAttack(this.level.getDamage());

        if (!target.isAlive())
            this.level.up();
    }


    public void receiveAttack(int damage) {
        this.hp.takeDamage(damage);
    }

    public void heal(Character target) throws Exception {
        if (this.equals(target))
            throw new Exception("Ta crue que tu pouvais te auto heal");

        if (this.isAlive())
            throw new Exception("Tes mort tu peut pas joué");

        if (target.isAlive())
            throw new Exception("Tu heal pas un mor mor mor, noob");

        target.receiveHeal(this.level.getHeal());
    }

    public void receiveHeal(int healPoint) {
        this.hp.takeHeal(healPoint);
    }

}
