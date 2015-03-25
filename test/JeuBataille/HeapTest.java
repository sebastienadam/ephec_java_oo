package JeuBataille;

import JeuDeCartes.Card;
import JeuDeCartes.Color;
import JeuDeCartes.Value;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeapTest {
  
  private Heap heap;
  
  public HeapTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    heap = new Heap();
  }
  
  @After
  public void tearDown() {
  }

   @Test
   public void add() {
     heap.add(new Card(Value.Valet, Color.Coeur));
     assertEquals(1, heap.size());
   }
   
   @Test
   public void remove() {
     Card carte1 = new Card(Value.Valet, Color.Coeur);
     heap.add(carte1);
     heap.add(new Card(Value.Valet, Color.Pique));
     assertEquals(carte1, heap.remove());
     assertEquals(1, heap.size());
   }
   
   @Test
   public void clear() {
     heap.add(new Card(Value.Valet, Color.Coeur));
     heap.clear();
     assertEquals(0, heap.size());
   }
}
