package model;

public enum PersoType {
    WARRIOR(Warrior.class), TANK(Tank.class);

    Class classType;

    private PersoType(Class classType) {
        this.classType = classType;
    }

    public Class getClassType() {
        return classType;
    }
}
