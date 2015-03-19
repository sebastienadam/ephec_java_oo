package JeuDeCartes;

import java.util.ArrayList;

public class Paquet {
  private final ArrayList<Carte> paquet;
  
  public Paquet() {
    paquet = new ArrayList<>();
    for (Valeur val : Valeur.values()) {
      for (Couleur coul : Couleur.values()) {
        paquet.add(new Carte(val, coul));
      }
    }
  }
  
  /**
   * Indique le nombre de cartes restant dans le paquet.
   * 
   * @return Le nombre de cartes restant dans le paquet.
   */
  public int size() {
    return paquet.size();
  }
  
  /**
   * Indique si le paquet est vide ou non.
   * 
   * @return 'true' si le paquet est vide, 'false' sinon.
   */
  public boolean isEmpty() {
    return paquet.isEmpty();
  }
  
  /**
   * Pêche une carte aléatoire dans le paquet.
   * 
   * @return Une carte aléatoire du paquet.
   */
  public Carte pecher() {
    return paquet.remove((int)Math.floor(Math.random()*paquet.size()));
  }
}
