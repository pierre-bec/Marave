package Round.Factory;

import Entity.Interface.IPlayer;
import Round.Concrete.RoundFight;
import Round.Concrete.RoundMaitreArme;
import Round.Concrete.RoundMerlin;
import Round.Interface.IRound;
import Utils.Utils;

public class FactoryRound {

    public static IRound createRound(IPlayer entity)  {
        return switch (Utils.roundDice()) {
            case 1, 2 -> new RoundFight(entity);
            case 3 -> new RoundMerlin(entity);
            default -> new RoundMaitreArme(entity);
        };
    }

}
