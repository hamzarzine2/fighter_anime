package PersoFactory;

import model.Perso;
import model.PersoType;
import model.Tank;
import model.Warrior;

import java.util.HashMap;
import java.util.Map;

public class PersoFactory {
    private Map<PersoType, Perso> preBuildPersos;

    //todo : how to do it ? all the put inside the factory ? how make the name ?
    private PersoFactory() {
        preBuildPersos = new HashMap<PersoType, Perso>();
        preBuildPersos.put(PersoType.TANK, new Tank("Tank"));
        preBuildPersos.put(PersoType.WARRIOR, new Warrior("Warrior"));
    }

    public Perso getPerso(PersoType persoType) {
        return this.preBuildPersos.get(persoType);
    }
}
