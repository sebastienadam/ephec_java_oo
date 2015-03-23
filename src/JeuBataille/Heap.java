package JeuBataille;

import JeuDeCartes.Card;
import java.util.ArrayDeque;

public class Heap {
  private final ArrayDeque<Card> heap;
  
  public Heap() {
    heap = new ArrayDeque<>();
  }
  
  public void add(Card carte) {
    heap.add(carte);
  }

  public void clear() {
    heap.clear();
  }
  public boolean isEmpty() {
    return heap.isEmpty();
  }
  
  public Card remove() {
    return heap.remove();
  }

  public int size() {
    return heap.size();
  }
}
