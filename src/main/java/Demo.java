import ucu.edu.ua.Character;
import ucu.edu.ua.CharacterFactory;
import ucu.edu.ua.GameManager;

public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello, world!");

        Character randomCharacter1 = CharacterFactory.createCharacter();
        System.out.println(randomCharacter1);
        Character randomCharacter2 = CharacterFactory.createCharacter();
        System.out.println(randomCharacter2);

        for(int i=0; i<10; i++) {
            System.out.println(CharacterFactory.createCharacter());
        }
        GameManager game = new GameManager();
        game.fight(randomCharacter1, randomCharacter2);
    }
}
