package JeuDeCartesTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import JeuDeCartes.Carte;
import JeuDeCartes.Couleur;
import JeuDeCartes.Valeur;

public class CarteTest {
  private Carte carte;
  
  public CarteTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    carte = new Carte(Valeur.Valet, Couleur.Coeur);
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void CompareCarteWithEqual() {
    assertEquals(0,carte.compare(new Carte(Valeur.Valet, Couleur.Pique)));
  }

  @Test
  public void CompareCarteWithLess() {
    assertEquals(1,carte.compare(new Carte(Valeur.Dix, Couleur.Pique)));
  }

  @Test
  public void CompareCarteWithMore() {
    assertEquals(-1,carte.compare(new Carte(Valeur.Dame, Couleur.Pique)));
  }
  
  @Test
  public void ToString() {
    assertTrue(carte.toString().equals("Valet de Coeur"));
  }
}
