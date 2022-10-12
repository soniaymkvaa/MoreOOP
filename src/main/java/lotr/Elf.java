package lotr;


public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }


    public void kick(Character c) {
        if (getPower() < c.getPower()) {
            setPower(getPower() - 1);
        }
        else {
            c.setHp(0);
        }
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
