package Round.Concrete;

import Entity.Interface.IPlayer;
import Round.Abstract.Round;

public class RoundMerlin extends Round {
    public RoundMerlin(IPlayer player) {
        super(player);
    }

    @Override
    public void run()  {
        System.out.println("Mais c'est Merlin !");
        this.player.heal(100);
    }
}
