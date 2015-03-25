package JeuBataille;

import JeuDeCartes.Card;
import java.util.ArrayDeque;

/**
 * Liste de cartes organisée en FIFO.
 * 
 * @author Sébastien
 */
public class Heap {
  private final ArrayDeque<Card> heap;
  
  public Heap() {
    heap = new ArrayDeque<>();
  }
  
  /**
   * Ajoute une carte à la fin de la liste.
   * 
   * @param card carte à ajouter.
   */
  public void add(Card card) {
    heap.add(card);
  }

  /**
   * Vide la liste.
   */
  public void clear() {
    heap.clear();
  }
  
  /**
   * Teste si la liste est vide ou non.
   * 
   * @return 'true' si la liste est vide, 'false' sinon.
   */
  public boolean isEmpty() {
    return heap.isEmpty();
  }
  
  /**
   * Retire une carte en début de liste.
   * 
   * @return la carte retirée.
   */
  public Card remove() {
    return heap.remove();
  }
  
  /**
   * Donne le nombre de cartes qui restent dans la liste.
   * 
   * @return le nombre de cartes restant.
   */
  public int size() {
    return heap.size();
  }
}
