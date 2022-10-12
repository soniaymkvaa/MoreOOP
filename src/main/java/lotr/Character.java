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
        this.hp = hp < 0 ? 0 : hp;
    }

    public abstract void kick(Character c);

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
