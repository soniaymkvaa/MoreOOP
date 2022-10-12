package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character createCaracter() {
        Character[] sth = {new Hobbit(), new Elf(), new King(), new Knight()};
        int a = new Random().nextInt(sth.length);
        return sth[a];
    }
}
