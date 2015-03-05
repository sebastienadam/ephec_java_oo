/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import E013_JeuDeNim.Player;

/**
 *
 * @author Sébastien
 */
public class PlayerTest {
  Player player;
  
  public PlayerTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    player = new Player("Jean");
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void getName() {
    assertTrue(player.getName().equals("Jean"));
  }
}
