package Entity.Factory;

import Entity.Concrete.Enemy;
import Entity.Interface.IPlayer;

public class FactoryEnemy {

    public Enemy createEnemy(IPlayer player)  {
        return new Enemy(player.getLevel()*2+12, player.getLevel()*2+12, player.getLevel()*2+25);
    }

}
