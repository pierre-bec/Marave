package Utils;

import java.util.Random;

public class Utils {

    public static boolean percent(int percent) {
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(percent + 1);
        return nombreAleatoire >= percent;
    }

    public static int roundDice() {
        Random rand = new Random();
        return rand.nextInt(4 - 1 + 1) + 1;
    }

    public static int d12() {
        Random rand = new Random();
        return rand.nextInt(12 - 1 + 1) + 1;
    }

}
