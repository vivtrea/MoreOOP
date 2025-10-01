package ucu.edu.ua;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("✩░▒▓▆▅▃▂▁ The fight between " + c1 + " and " + c2 + " has begun! ▁▂▃▅▆▓▒░✩");

        while (c1.isAlive() && c2.isAlive()) {

            System.out.println(c1 + " =={==========- " + c2);
            c1.kick(c2);
            System.out.println("After attack: " + c2);

            if (!c2.isAlive()) {
                System.out.println(c2 + " has been defeated!");
                System.out.println(c1 + " won!");
                break;
            }

            System.out.println(c2 + " =={==========- " + c1);
            c2.kick(c1);
            System.out.println("After attack: " + c1);

            if (!c1.isAlive()) {
                System.out.println(c1 + " has been defeated!");
                System.out.println(c2 + " won!");
                break;
            }
        }

        System.out.println("✩░▒▓▆▅▃▂▁ !Fight finished! ▁▂▃▅▆▓▒░✩");
    }
}