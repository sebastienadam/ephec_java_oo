package JeuBataille;

import JeuDeCartes.Card;
import java.util.ArrayList;
import java.util.HashMap;

public class Table {

  private HashMap<Player, ArrayList<Card>> givenCards;
  private Player winner;

  public Table() {
    givenCards = new HashMap<>();
  }

  public HashMap<Player, ArrayList<Card>> getGivenCards() {
    return givenCards;
  }

  public Player getWinner() {
    return winner;
  }

  void pickUp() {
    if (winner == null) {
      throw new IllegalStateException("Il n'y a pas de gangnant");
    } else {
      ArrayList<Card> cards;
      for (Player player : givenCards.keySet()) {
        cards = givenCards.get(player);
        if (!cards.isEmpty()) {
          for (Card card : cards) {
            winner.recieveCard(card);
          }
          cards.clear();
        }
      }
      winner = null;
    }
  }

  void play(ArrayList<Player> players) {
    givenCards.clear();
    players.stream().forEach((player) -> {
      givenCards.put(player, new ArrayList<>());
    });
    Card strongerCard = null;
    ArrayList<Player> strongerCardGiver = new ArrayList<>();
    Card currentCard;
    for (Player player : givenCards.keySet()) {
      if (player.hasCards()) {
        currentCard = player.giveCard();
        if (strongerCard == null) {
          strongerCard = currentCard;
          strongerCardGiver.add(player);
        } else if (strongerCard.compare(currentCard) == 0) {
          strongerCardGiver.add(player);
        } else if (strongerCard.compare(currentCard) < 0) {
          strongerCard = currentCard;
          strongerCardGiver.clear();
          strongerCardGiver.add(player);
        }
        givenCards.get(player).add(currentCard);
      }
    }
    while (strongerCardGiver.size() > 1) {
      int maxGivenCardsListSize;
      strongerCardGiver.stream().forEach((player) -> {
        for (int i = 0; i < 2; i++) {
          if (player.hasCards()) {
            givenCards.get(player).add(player.giveCard());
          }
        }
      });
      maxGivenCardsListSize = 0;
      for (ArrayList<Card> cards : givenCards.values()) {
        if (cards.size() > maxGivenCardsListSize) {
          maxGivenCardsListSize = cards.size();
        }
      }
      strongerCardGiver.clear();
      strongerCard = null;
      for (Player player : givenCards.keySet()) {
        ArrayList<Card> cards = givenCards.get(player);
        if (cards.size() == maxGivenCardsListSize) {
          currentCard = cards.get(maxGivenCardsListSize - 1);
          if (strongerCard == null) {
            strongerCard = currentCard;
            strongerCardGiver.add(player);
          } else if (strongerCard.compare(currentCard) == 0) {
            strongerCardGiver.add(player);
          } else if (strongerCard.compare(currentCard) < 0) {
            strongerCard = currentCard;
            strongerCardGiver.clear();
            strongerCardGiver.add(player);
          }
        }
      }
    }
    winner = strongerCardGiver.get(0);
  }
}
