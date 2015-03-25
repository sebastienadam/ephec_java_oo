package JeuDeCartes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import JeuDeCartes.Card;
import JeuDeCartes.Color;
import JeuDeCartes.Value;

public class CardTest {
  private Card card;
  
  public CardTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    card = new Card(Value.Valet, Color.Coeur);
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void CompareCarteWithEqual() {
    assertEquals(0,card.compare(new Card(Value.Valet, Color.Pique)));
  }

  @Test
  public void CompareCarteWithLess() {
    assertEquals(1,card.compare(new Card(Value.Dix, Color.Pique)));
  }

  @Test
  public void CompareCarteWithMore() {
    assertEquals(-1,card.compare(new Card(Value.Dame, Color.Pique)));
  }

  @Test
  public void HasSameValue() {
    assertTrue(card.isSame(new Card(Value.Valet, Color.Coeur)));
  }
  
  @Test
  public void ToString() {
    assertTrue(card.toString().equals("Valet de Coeur"));
  }
}
