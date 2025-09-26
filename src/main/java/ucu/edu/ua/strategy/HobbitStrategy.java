package ucu.edu.ua.strategy;
import ucu.edu.ua.Character;

public class HobbitStrategy extends KickStrategy{
    @Override
    public void kick(Character main, Character enemy) {
        System.out.println("Cry a lot!");
    }
}
