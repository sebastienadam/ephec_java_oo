package JeuBatailleTest;

import JeuBataille.Player;
import JeuDeCartes.Card;
import JeuDeCartes.Color;
import JeuDeCartes.Value;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  
  private Player player;
  
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
   public void dontHaveCardsOncreate() {
     assertFalse(player.hasMoreCards());
   }
   
   @Test(expected=NoSuchElementException.class)
   public void failGetCardWhenEmpyHeap() {
     player.giveCard();
   }
   
   @Test
   public void recieveCard() {
     player.recieveCard(new Card(Value.Valet, Color.Coeur));
     assertSame(1, player.cardsCount());
   }
   
   @Test
   public void giveCard() {
     Card card1 = new Card(Value.Valet, Color.Coeur);
     Card card2 = new Card(Value.Valet, Color.Pique);
     player.recieveCard(card1);
     player.recieveCard(card2);
     assertSame(card1, player.giveCard());
     assertSame(1, player.cardsCount());
   }
   
   @Test
   public void clearCards() {
     player.recieveCard(new Card(Value.Valet, Color.Coeur));
     player.clearHeap();
     assertSame(0, player.cardsCount());
   }
}
