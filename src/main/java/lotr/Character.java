package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter @Setter
    private int power;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    public boolean isAlive() {
        return getHp() > 0;
    }
    public abstract void kick(Character c);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                "}";
    }
}
