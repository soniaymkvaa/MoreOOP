package lotr;

public class Main {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCaracter();
        Character c2 = CharacterFactory.createCaracter();
        System.out.println(c1);
        System.out.println(c2);
        GameManager.fight(c1, c2);
    }
}
