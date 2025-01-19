import model.Perso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("going to fight");

        int defaultHealth = 100;
        int defaultPower = 5;
        int health, power;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your health");
        health = input.nextInt();
        System.out.println("Please enter your power");
        power = input.nextInt();

        Perso userPerso = new Perso(health, "userPerso", power);
        Perso bossPerso = new Perso(defaultHealth, "bossPerso", defaultPower);
        while (userPerso.getHealth() > 0 && bossPerso.getHealth() > 0) {
            userPerso.hit(bossPerso);
            bossPerso.hit(userPerso);
            System.out.println("You have " + userPerso.getHealth() + " health");
            System.out.println("Boss has " + bossPerso.getHealth() + " health");
        }

    }
}