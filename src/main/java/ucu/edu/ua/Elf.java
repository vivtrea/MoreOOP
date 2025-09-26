package ucu.edu.ua;

import ucu.edu.ua.strategy.ElfStrategy;

public class Elf extends Character{
    public Elf(){
        super(10, 10, new ElfStrategy());
    }
    @Override
    public void kick(Character enemy) {
        getKickStrategy().kick(this, enemy);
        
    }
}
