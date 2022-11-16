package Entity.Interface;

public interface IPlayer extends IEntity{

    void healOnCurrentPdv(int percentage);

    void fullHeal();

     void divideSkillPoints(int points);

     void levelUp();

     int getLevel();

}
