package JeuBataille;

import JeuBataille.Game;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sébastien
 */
public class GameTest {
  private Game game;
  
  public GameTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    game = new Game();
  }
  
  @After
  public void tearDown() {
  }

   @Test (expected=NotEnoughtPlayersException.class)
   public void startGameWithNoPlayer() throws NotEnoughtPlayersException {
     game.newPart();
   }

  // @Test
  // public void hello() {}
}
