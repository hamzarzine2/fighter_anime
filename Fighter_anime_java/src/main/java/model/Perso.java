package model;

public abstract class Perso {
    private int health;
    private String name;
    private int power;

    public Perso(int health, String name, int power) {
        this.health = health;
        this.name = name;
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void hit(Perso perso) {
        this.health -= perso.getPower();
    }
}
