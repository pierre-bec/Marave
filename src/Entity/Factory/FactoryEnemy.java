package Entity.Factory;

import Entity.Concrete.Enemy;
import Entity.Interface.IPlayer;

public class FactoryEnemy {

    public static Enemy createEnemy(IPlayer player)  {
        return new Enemy(player.getLevel()*2+12, player.getLevel()*2+12, player.getLevel()*2+25);
    }

}
