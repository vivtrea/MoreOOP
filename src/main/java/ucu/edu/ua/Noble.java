package ucu.edu.ua;

import java.util.Random;

import ucu.edu.ua.strategy.NobleStrategy;

public class Noble extends Character {
    private static Random RANDOM = new Random();
    public Noble(int minPower, int maxPower, int minHp, int maxHp){
        super(RANDOM.nextInt(maxPower-minPower)+minPower, 
        RANDOM.nextInt(maxHp-minHp)+minHp, new NobleStrategy());
    }
    @Override
    public void kick(Character enemy) {
        getKickStrategy().kick(this, enemy);
        
    }
}
