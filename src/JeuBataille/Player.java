package JeuBataille;

import JeuDeCartes.Card;

public class Player {
  private final String name;
  private final Heap heap;
  
  public Player(String name) {
    this.name = name;
    this.heap = new Heap();
  }
  
  public int cardsCount() {
    return heap.size();
  }
  
  void clearHeap() {
    heap.clear();
  }

  public String getName() {
    return name;
  }
  
  Card giveCard() {
    return heap.remove();
  }

  public boolean hasCards() {
    return !heap.isEmpty();
  }
  
  void recieveCard(Card card) {
    heap.add(card);
  }

  @Override
  public String toString() {
    return String.format("%s (%d)", name, heap.size());
  }
}
