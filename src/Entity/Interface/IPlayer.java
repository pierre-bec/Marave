package Entity.Interface;

public interface IPlayer extends IEntity{

    void heal(int percentage);

     void divideSkillPoints(int points);

     void levelUp();

     int getLevel();

}
