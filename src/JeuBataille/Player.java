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
  
  public void clearHeap() {
    heap.clear();
  }

  public String getName() {
    return name;
  }
  
  public Card giveCard() {
    return heap.remove();
  }

  public boolean hasMoreCards() {
    return !heap.isEmpty();
  }
  
  public void recieveCard(Card card) {
    heap.add(card);
  }
}
