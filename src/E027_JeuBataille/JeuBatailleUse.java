package E027_JeuBataille;

import JeuBataille.Game;
import JeuBataille.Player;
import JeuBataille.Table;
import JeuDeCartes.Card;
import java.util.ArrayList;

public class JeuBatailleUse {

  public static void main(String[] args) {
    Game game = new Game();
    Table table = game.getTable();
    ArrayList<Player> players = game.getPlayers();
    game.addPlayer("Alain");
    game.addPlayer("Bart");
    game.addPlayer("Charles");
    game.addPlayer("Didier");
    try {
      game.newPart();
      System.out.println("Joueurs :");
      players.stream().forEach((player) -> {
        System.out.println("    " + player);
      });
      while (!game.hasWinner()) {
        game.play();
        System.out.println("Cartes déposées:");
        table.getGivenCards().keySet().stream().map((player) -> {
          System.out.print("    " + player + " : ");
          return player;
        }).map((player) -> {
          table.getGivenCards().get(player).stream().forEach((card) -> {
            System.out.print(card + ", ");
          });
          return player;
        }).forEach((_item) -> {
          System.out.println("");
        });
        System.out.println("    C'est " + table.getWinner().getName() + " qui remporte la mise.");
      }
      System.out.println("Le grand gagnant est : " + game.getWinner().getName());
    } catch (Exception e) {
      System.out.println("Excception: " + e.toString());
    }
  }
}
