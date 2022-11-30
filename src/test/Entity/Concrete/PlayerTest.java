package test.Entity.Concrete;

import Entity.Concrete.Player;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * Player Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>nov. 17, 2022</pre>
 */
public class PlayerTest {


    /**
     * Method: healOnCurrentPdv(int percentage)
     */
    @Test
    public void testConstructor() throws Exception {
        Player player = new Player();
        assertEquals(1, player.getLevel());
        assertEquals(30, player.getMaxPdv());
        assertEquals(30, player.getPdv());
        assertEquals(15, player.getArmor());
        assertEquals(15, player.getStrength());
    }

    /**
     * Method: healOnCurrentPdv(int percentage)
     */
    @Test
    public void testHealOnCurrentPdv() throws Exception {
        Player player = new Player();
        player.removePdv(20);
        player.healOnCurrentPdv(50);
        assertEquals(15, player.getPdv());
    }

    /**
     * Method: fullHeal()
     */
    @Test
    public void testFullHeal() throws Exception {
        Player player = new Player();
        player.removePdv(20);
        player.fullHeal();
        assertEquals(30, player.getPdv());
    }

    /**
     * Method: levelUp()
     */
    @Test
    public void testLevelUp() throws Exception {
        Player player = new Player();
        player.removePdv(20);
        player.levelUp();
        assertEquals(2, player.getLevel());
        assertEquals(11, player.getPdv());
    }

    /**
     * Method: getLevel()
     */
    @Test
    public void testGetLevel() throws Exception {
        Player player = new Player();
        assertEquals(1, player.getLevel());
    }


} 
