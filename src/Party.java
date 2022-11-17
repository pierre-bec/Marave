import Entity.Concrete.Player;
import Entity.Interface.IPlayer;
import Round.Factory.FactoryRound;
import Round.Interface.IRound;

import java.util.Scanner;

public class Party {

    private int nbRound;

    private IPlayer player;

    public Party() {
        this.nbRound = 1;
    }

    private void initGame()  {
        this.player = new Player();
        this.player.divideSkillPoints(12);
    }

    public void runGame()  {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        while (true) {
            System.out.println("Round n°"+nbRound);
            System.out.println(this.player.toString());
            FactoryRound factoryRound = new FactoryRound();
            IRound round = factoryRound.createRound(this.player);
            round.run();
            if (this.isFinished()) {
                break;
            }
            System.out.print("Validez pour passer au prochain tour...\n");
            sc.nextLine();
            nbRound++;
        }
    }

    public boolean isFinished() {
        return player.isDead() || this.nbRound >= 20;
    }

    public void endGame() {
        System.out.println("C'est fini ! ");
        if (this.player.isDead()) {
            System.out.println("Dommage, vous avez perdu");
        } else {
            System.out.println("Bien joué, t'es resté vivant !");
        }
    }

    public void game()  {
        this.initGame();
        this.runGame();
        this.endGame();
    }
}
