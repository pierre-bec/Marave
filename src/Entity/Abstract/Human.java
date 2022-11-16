package Entity.Abstract;

import Entity.Interface.IEntity;

public abstract class Human implements IEntity {

    protected int pdv;

    protected int maxPdv;

    protected int armor;

    protected int strength;

    public boolean isDead() {
        return this.pdv <= 0;
    }

    @Override
    public void addMaxPdv(int maxPdv) {
        this.maxPdv += maxPdv;
    }

    @Override
    public void addArmor(int armor) {
        this.armor += armor;
    }

    @Override
    public void addStrength(int strength) {
        this.strength += strength;
    }


    @Override
    public void removePdv(int nbPdv) {
        if (this.pdv-nbPdv<0) {
            this.pdv = 0;
        } else {
            this.pdv -= nbPdv;
        }
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getPdv() {
        return pdv;
    }
}
