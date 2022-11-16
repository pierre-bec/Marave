package Round.Concrete;

import Entity.Interface.IPlayer;
import Round.Abstract.Round;

public class RoundMaitreArme extends Round {
    public RoundMaitreArme(IPlayer player) {
        super(player);
    }

    @Override
    public void run() {
        System.out.println("Maitre d'arme : Debout ! ... Bon toutou\n");
        this.player.levelUp();
    }
}
