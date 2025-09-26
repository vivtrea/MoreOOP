package ucu.edu.ua;

import ucu.edu.ua.strategy.HobbitStrategy;

public class Hobbit extends Character {
    public Hobbit(){
        super(0, 3, new HobbitStrategy());
    }
    @Override
    public void kick(Character c) {
        getKickStrategy().kick(this, c);
    }
    // private void toCry(){
    //     System.out.println("Cry a lot!");
    // }
}
