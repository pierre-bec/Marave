package Round.Phase.Concrete;

import Entity.Interface.IEntity;
import Round.Phase.Interface.IPhase;
import Utils.Utils;

public class Phase implements IPhase {

    protected IEntity attacker;

    protected IEntity defenser;

    public Phase(IEntity attacker, IEntity defenser) {
        this.attacker = attacker;
        this.defenser = defenser;
    }

    public boolean someoneIsDead() {
        return attacker.isDead() || defenser.isDead();
    }

    public void marave() {
        this.defenser.removePdv(Utils.d12() + this.attacker.getStrength() - this.attacker.getArmor());
    }
}
