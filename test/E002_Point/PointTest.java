package E002_Point;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
  private Point instance;
  
  public PointTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    instance = new Point('P', 5.0);
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getPosition method, of class Point.
   */
  @Test
  public void testGetPosition() {
    double expResult = 5.0;
    double result = instance.getPosition();
    assertEquals(expResult, result, 0.0);
  }

  /**
   * Test of translate method, of class Point.
   */
  @Test
  public void testTranslate() {
    double distance = 2.0;
    double expResult = 7.0;
    double result = instance.translate(distance);
    assertEquals(expResult, result, 0.0);
  }

  /**
   * Test of toString method, of class Point.
   */
  @Test
  public void testToString() {
    String expResult = "P(5)";
    String result = instance.toString();
    assertEquals(expResult, result);
  }
}
