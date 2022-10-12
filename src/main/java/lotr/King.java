package lotr;

public class King extends Character {
    public King() {
        super(random.nextInt(10) + 5, random.nextInt(10) + 5);
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - random.nextInt(getPower()));
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
