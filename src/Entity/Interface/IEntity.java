package Entity.Interface;

public interface IEntity {

    boolean isDead();
    void addMaxPdv(int maxPdv);

    void addArmor(int armor);

    void addStrength(int strength);

    void removePdv(int nbPdv);

    int getStrength();

    int getArmor();

    int getPdv();

}
