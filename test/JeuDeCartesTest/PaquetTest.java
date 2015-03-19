package JeuDeCartesTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import JeuDeCartes.Paquet;

public class PaquetTest {
  private Paquet paquet;
  
  
  public PaquetTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    paquet = new Paquet();
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void taillePlein() {
    assertEquals(52, paquet.size());
  }
  @Test
  public void vider() {
    int nb = 0;
    while (!paquet.isEmpty()) {      
      paquet.pecher();
      nb++;
    }
    assertEquals(0, paquet.size());
    assertEquals(52, nb);
  }
}
