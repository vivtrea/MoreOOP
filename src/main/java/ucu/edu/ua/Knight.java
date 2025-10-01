package ucu.edu.ua;


public class Knight extends Noble{

    public Knight(){
        super(2, 12, 2, 12);
    }
    @Override
    public void kick(Character enemy) {
        getKickStrategy().kick(this, enemy);
    }
    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
