package Entity.Concrete;

import Entity.Abstract.Human;

public class Enemy extends Human {

    public Enemy(int strength, int armor, int pdv) {
        this.strength = strength;
        this.armor = armor;
        this.pdv = pdv;
    }

    @Override
    public String toString() {
        return "Entity.Interface.Enemy{" +
                "pdv=" + pdv +
                ", maxPdv=" + maxPdv +
                ", armor=" + armor +
                ", strength=" + strength +
                '}';
    }
}
