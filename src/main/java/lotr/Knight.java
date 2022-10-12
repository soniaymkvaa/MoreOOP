package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(random.nextInt(10) + 2, random.nextInt(10) + 2);
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - random.nextInt(getPower()));
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}

