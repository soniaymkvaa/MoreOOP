package lotr;

import java.util.Random;

public abstract class Character {
    public static Random random = new Random();
    private int power;
    private int hp;
    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive() {
        return this.getHp() > 0;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
//        int updated = hp - power;
//        this.hp = Math.max(updated, 0);
        this.hp = hp < 0 ? 0 : hp;
    }

    public abstract void kick(Character c);

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

//    public String toString() {
//        String var10000 = this.getClass().getSimpleName();
//        return getClass() + "{hp=" + this.hp + ", power=" + this.power + "}";
//        //return var10000 + "{hp=" + this.hp + ", power=" + this.power + "}";
//    }
}
