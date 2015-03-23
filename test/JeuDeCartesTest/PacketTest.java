package JeuDeCartesTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import JeuDeCartes.Packet;

public class PacketTest {
  private Packet packet;
  
  
  public PacketTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    packet = new Packet();
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void sizeFull() {
    assertEquals(52, packet.size());
  }
  @Test
  public void empty() {
    int nb = 0;
    while (!packet.isEmpty()) {      
      packet.take();
      nb++;
    }
    assertEquals(0, packet.size());
    assertEquals(52, nb);
  }
}
