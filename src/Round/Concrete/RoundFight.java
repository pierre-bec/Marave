package Round.Concrete;

import Entity.Factory.FactoryEnemy;
import Entity.Interface.IEntity;
import Entity.Interface.IPlayer;
import Round.Abstract.Round;
import Round.Phase.Concrete.Phase;
import Round.Phase.Interface.IPhase;
import Utils.Utils;

public class RoundFight extends Round {

    private final IPhase phaseAttack;

    private final IPhase phaseDefense;

    private final IEntity ennemy;
    public RoundFight(IPlayer player)  {
        super(player);
        FactoryEnemy factoryEnemy = new FactoryEnemy();
        this.ennemy = factoryEnemy.createEnemy(player);
        System.out.println("-----------------------------------------Combat------------------------------------------");
        IEntity attacker;
        IEntity defenser;
        if (Utils.percent(65)) {
            System.out.println("Vous attaquez en premier !");
            attacker = player;
            defenser = this.ennemy;
        } else {
            System.out.println("L'ennemi vous surprend !");
            attacker = this.ennemy;
            defenser = player;
        }
        this.phaseAttack = new Phase(attacker, defenser);
        this.phaseDefense = new Phase(defenser, attacker);
    }


    @Override
    public void run() {
        displayState();
        while (!this.phaseAttack.someoneIsDead()) {
            this.phaseAttack.marave();
            this.phaseDefense.marave();
            displayState();
        }
    }

    public void displayState() {
        System.out.println("Personnage : "+this.player.getPdv()+" - "+this.ennemy.getPdv()+" : Ennemi");
        System.out.println("--------------------");
    }
}
