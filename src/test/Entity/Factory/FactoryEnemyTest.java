package test.Entity.Factory;

import Entity.Concrete.Enemy;
import Entity.Concrete.Player;
import Entity.Factory.FactoryEnemy;
import Entity.Interface.IPlayer;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * FactoryEnemy Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>nov. 17, 2022</pre>
 */
public class FactoryEnemyTest {


    /**
     * Method: createEnemy(IPlayer player)
     */
    @Test
    public void testCreateEnemy() throws Exception {
        FactoryEnemy factoryEnemy = new FactoryEnemy();
        Enemy enemy = factoryEnemy.createEnemy(new Player());
        assertEquals(27, enemy.getMaxPdv());
        assertEquals(27, enemy.getPdv());
        assertEquals(14, enemy.getArmor());
        assertEquals(14, enemy.getStrength());
    }

    /**
     * Method: createEnemy(IPlayer player)
     */
    @Test
    public void testCreateEnemyTwo() throws Exception {
        FactoryEnemy factoryEnemy = new FactoryEnemy();
        IPlayer player = new Player();
        player.levelUp();
        Enemy enemy = factoryEnemy.createEnemy(player);
        assertEquals(29, enemy.getMaxPdv());
        assertEquals(29, enemy.getPdv());
        assertEquals(16, enemy.getArmor());
        assertEquals(16, enemy.getStrength());
    }


} 
