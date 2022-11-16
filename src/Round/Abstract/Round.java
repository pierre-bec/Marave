package Round.Abstract;

import Entity.Interface.IPlayer;
import Round.Interface.IRound;

public abstract class Round implements IRound {

    public IPlayer player;

    public Round(IPlayer player) {
        this.player = player;
    }

    @Override
    public abstract void run();
}
