package ucu.edu.ua.strategy;

import ucu.edu.ua.Character;

public class ElfStrategy extends KickStrategy{
    @Override
    public void kick(Character main, Character enemy) {
        if (enemy.getPower() < main.getPower()){
            enemy.setHp(0);
        }
        else {
            main.setPower(main.getPower()-1);
        }
    }
}
