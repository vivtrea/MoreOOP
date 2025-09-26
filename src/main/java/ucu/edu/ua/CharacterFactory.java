package ucu.edu.ua;

import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private static Random RANDOM = new Random();

    public static List<Class<?>> characterTypes 
        = List.of(Hobbit.class, King.class, Knight.class);

    public static Character createCharacter2(){
        characterTypes.get(RANDOM.nextInt(3));
        return null;
    }

    public static Character createCharacter(){
        int randomNumber = RANDOM.nextInt(3);
        switch (randomNumber) {
            case 0:
                return new Hobbit();
            case 1:
                return new King();
            case 2:
                return new Knight();
            case 3:
                return new Elf();
        
            default:
                break;
        }
        return null;
        
    }
}
