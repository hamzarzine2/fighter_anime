package model;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Perso> chosenPerso;

    public User(int id, String name, ArrayList<Perso> chosenPerso) {
        this.id = id;
        this.name = name;
        this.chosenPerso = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Perso> getChosenPerso() {
        return chosenPerso;
    }

    public void addPerso(Perso perso) {
        chosenPerso.add(perso);
    }

    public void removePerso(Perso perso) {
        chosenPerso.remove(perso);
    }
}
