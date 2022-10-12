package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        if (c1.getPower() == c2.getPower()) {
            System.out.println("They are friends");
        }
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c2.toString() + " is kicked by " + c1.toString());
            c1.kick(c2);
            System.out.println("c2: " + c2.toString());
            if (c2.isAlive()) {
                System.out.println(c1.toString() + " is kicked by " + c2.toString());
                c2.kick(c1);
                System.out.println("c1: " + c1.toString());
            }
        }
        if (c1.isAlive()) {
            System.out.println("Player " + c1.toString() + " is a winner");
        } else if (c2.isAlive()) {
            System.out.println("Player " + c2.toString() + " is a winner");
        }
    }
}
