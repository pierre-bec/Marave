package test.Entity.Abstract;

import Entity.Abstract.Human;
import Entity.Concrete.Enemy;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/** 
* Human Tester. 
* 
* @author <Authors name> 
* @since <pre>nov. 17, 2022</pre> 
* @version 1.0 
*/ 
public class HumanTest {


/** 
* 
* Method: isDead() 
* 
*/ 
@Test
public void testIsDead() throws Exception {
    Human human = new Enemy(10, 10, 10);
    assertFalse(human.isDead());
    human.removePdv(10);
    assertTrue(human.isDead());
} 

/** 
* 
* Method: addMaxPdv(int maxPdv) 
* 
*/ 
@Test
public void testAddMaxPdv() throws Exception {
    Human human = new Enemy(10, 10, 10);
    human.addMaxPdv(15);
    assertEquals(25, human.getMaxPdv());
} 

/** 
* 
* Method: addArmor(int armor) 
* 
*/ 
@Test
public void testAddArmor() throws Exception {
    Human human = new Enemy(10, 10, 10);
    human.addArmor(15);
    assertEquals(25, human.getArmor());
} 

/** 
* 
* Method: addStrength(int strength) 
* 
*/ 
@Test
public void testAddStrength() throws Exception {
    Human human = new Enemy(10, 10, 10);
    human.addStrength(15);
    assertEquals(25, human.getStrength());
} 

/** 
* 
* Method: removePdv(int nbPdv) 
* 
*/ 
@Test
public void testRemovePdv() throws Exception {
    Human human = new Enemy(10, 10, 10);
    human.removePdv(7);
    assertEquals(3, human.getPdv());
}

@Test
public void testRemovePdvNotNegative() throws Exception {
    Human human = new Enemy(10, 10, 10);
    human.removePdv(15);
    assertEquals(0, human.getPdv());
}

/** 
* 
* Method: getArmor() 
* 
*/ 
@Test
public void testGetArmor() throws Exception {
    Human human = new Enemy(10, 5, 2);
    assertEquals(5, human.getArmor());
} 

/** 
* 
* Method: getStrength() 
* 
*/ 
@Test
public void testGetStrength() throws Exception {
    Human human = new Enemy(10, 5, 2);
    assertEquals(10, human.getStrength());
} 

/** 
* 
* Method: getPdv() 
* 
*/ 
@Test
public void testGetPdv() throws Exception {
    Human human = new Enemy(10, 5, 2);
    assertEquals(2, human.getPdv());
} 


} 
