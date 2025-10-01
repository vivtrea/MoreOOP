package ucu.edu.ua;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private static Random RANDOM = new Random();
    private static final List<Class<? extends Character>> characterTypes = List.of(
        Hobbit.class,
        King.class,
        Knight.class,
        Elf.class
    );
//InvocationTargetExceptionJava,NoSuchMethodException,IllegalAccessExceptionJava,InstantiationExceptionJava
    public static Character createCharacter() {
            int randomNumber = new Random().nextInt(characterTypes.size());
            Class<?> result = characterTypes.get(randomNumber);

            try {
                return (Character) result.getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException |
                    InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }
    }

    

    // public static Character createCharacter2(){
    //     characterTypes.get(RANDOM.nextInt(3));
    //     return null;
    // }

    public static Character createCharacterSwitchCase(){
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
