package ucu.edu.ua.strategy;

import java.util.Random;

import ucu.edu.ua.Character;

public class NobleStrategy extends KickStrategy{
    private static Random RANDOM = new Random();

    @Override
    public void kick(Character main, Character enemy) {
        int enemyHp = enemy.getHp();
        enemy.setHp(
            enemyHp-RANDOM.nextInt(main.getPower())
        );

        
    }
}
