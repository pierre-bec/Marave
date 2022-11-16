package Entity.Concrete;

import Entity.Abstract.Human;
import Entity.Interface.IPlayer;

import java.util.Scanner;

public class Player extends Human implements IPlayer {

    protected int level;

    public Player() {
        this.level = 1;
        this.maxPdv = 30;
        this.pdv = this.maxPdv;
        this.armor = 15;
        this.strength = 15;
    }

    @Override
    public String toString() {
        return  "---------------" +
                "|level|"+level+"|--|pdv|"+pdv+"|--|maxPdv|"+maxPdv+"|--|armor|"+armor+"|--|strength|"+strength +"|"+
                "---------------";
    }

    public void healOnCurrentPdv(int percentage) {
        int newAmountPdv = this.pdv * (1+(percentage/100));
        this.pdv = Math.min(newAmountPdv, this.maxPdv);
    }

    public void fullHeal() {
        this.pdv = this.maxPdv;
    }

    public void levelUp() {
        this.level++;
        this.divideSkillPoints(3);
        this.healOnCurrentPdv(10);
    }

    public void divideSkillPoints(int nbPoints) {
        System.out.println("Vous avez " + nbPoints + " points à répartir");
        Scanner sc = new Scanner(System.in);
        int strengthPoints;
        do {
            System.out.print("Force : ");
            strengthPoints = sc.nextInt();
        } while (strengthPoints>nbPoints);
        this.addStrength(strengthPoints);
        int armorPoints;
        do {
            System.out.print("Armure : ");
            armorPoints = sc.nextInt();
        } while (strengthPoints + armorPoints > nbPoints);
        this.addArmor(armorPoints);
        int pdvMaxPoints;
        do {
            System.out.print("Vie : ");
            pdvMaxPoints = sc.nextInt();
        } while (strengthPoints + armorPoints + pdvMaxPoints > nbPoints);
        this.addMaxPdv(pdvMaxPoints);
        System.out.println();
    }

    public int getLevel() {
        return level;
    }
}
