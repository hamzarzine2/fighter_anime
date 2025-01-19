import PersoFactory.PersoFactory;
import model.Perso;
import model.PersoType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("going to fight");
        PersoFactory persoFactory = new PersoFactory();
        Perso userPerso = persoFactory.getPerso(PersoType.TANK);
        Perso bossPerso = persoFactory.getPerso(PersoType.WARRIOR);
        while (userPerso.getHealth() > 0 && bossPerso.getHealth() > 0) {
            userPerso.hit(bossPerso);
            bossPerso.hit(userPerso);
            System.out.println("You have " + userPerso.getHealth() + " health");
            System.out.println("Boss has " + bossPerso.getHealth() + " health");
        }

    }
}