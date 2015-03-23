package JeuDeCartes;

import java.util.ArrayList;

public class Packet {
  private final ArrayList<Card> packet;
  
  public Packet() {
    packet = new ArrayList<>();
    for (Value val : Value.values()) {
      for (Color col : Color.values()) {
        packet.add(new Card(val, col));
      }
    }
  }
  
  /**
   * Indique le nombre de cartes restant dans le paquet.
   * 
   * @return Le nombre de cartes restant dans le paquet.
   */
  public int size() {
    return packet.size();
  }
  
  /**
   * Indique si le paquet est vide ou non.
   * 
   * @return 'true' si le paquet est vide, 'false' sinon.
   */
  public boolean isEmpty() {
    return packet.isEmpty();
  }
  
  /**
   * Pêche une carte aléatoire dans le paquet.
   * 
   * @return Une carte aléatoire du paquet.
   */
  public Card take() {
    return packet.remove((int)Math.floor(Math.random()*packet.size()));
  }
}
