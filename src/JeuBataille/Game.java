package JeuBataille;

import JeuDeCartes.Card;
import JeuDeCartes.Packet;
import java.util.ArrayList;

public class Game {
  ArrayList<Player> players;
  ArrayList<Card> table;
  
  public Game() {
    players = new ArrayList<>();
    table = new ArrayList<>();
  }
  
  public void newPart() {
    if (players.size() < 2) {
      throw new IllegalStateException("Vous avez besoin d'au moins deux joueurs");
    } else {
      Packet packet = new Packet();
      int i;
      for (Player player : players) {
        player.clearHeap();
      }
      i = 0;
      while(!packet.isEmpty()) {
        players.get(i).recieveCard(packet.take());
        i++;
        if (i >= players.size()) {
          i = 0;
        }
      }
    }
  }
}
