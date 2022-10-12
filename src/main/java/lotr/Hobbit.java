package lotr;
public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }

    public void kick(Character c) {
        System.out.println("'cries'");
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
