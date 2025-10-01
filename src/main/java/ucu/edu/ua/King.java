package ucu.edu.ua;


public class King extends Noble {

    public King(){
        super(5, 15, 5, 15);
    }
    @Override
    public void kick(Character enemy) {
        getKickStrategy().kick(this, enemy);
    }
    @Override
    public String toString() {
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
