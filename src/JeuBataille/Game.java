package JeuBataille;

import JeuDeCartes.Packet;
import java.util.ArrayList;

public class Game {

  private final ArrayList<Player> players;
  private final ArrayList<Player> loosers;
  private final Table table;
  private Player winner;
  private boolean runningGame;
  private boolean tableEmpty;

  public Game() {
    players = new ArrayList<>();
    loosers = new ArrayList<>();
    table = new Table();
    runningGame = false;
    tableEmpty = true;
  }

  public void addPlayer(String name) {
    addPlayer(new Player(name));
  }

  public void addPlayer(Player player) {
    if (runningGame) {
      throw new IllegalStateException("De nouveaux joueurs ne peuvent pas être ajoutés en cours de partie");
    } else {
      players.add(player);
    }
  }

  public ArrayList<Player> getLoosers() {
    return loosers;
  }

  public ArrayList<Player> getPlayers() {
    return players;
  }

  public Table getTable() {
    return table;
  }

  public Player getWinner() {
    return winner;
  }

  public boolean hasWinner() {
    return winner != null;
  }

  public void newPart() throws NotEnoughtPlayersException {
    reset();
    if (players.size() < 2) {
      throw new NotEnoughtPlayersException("Vous avez besoin d'au moins deux joueurs");
    } else {
      runningGame = true;
      Packet packet = new Packet();
      int i = 0;
      while (!packet.isEmpty()) {
        players.get(i).recieveCard(packet.take());
        i++;
        if (i >= players.size()) {
          i = 0;
        }
      }
    }
  }

  public void play() {
    if (runningGame) {
      if (!tableEmpty) {
        pickUp();
      }
      table.play(players);
      tableEmpty = false;
    } else {
      throw new IllegalStateException("Vous devez initialiser une partie pour pouvoir jouer");
    }
  }

  public void pickUp() {
    if (runningGame) {
      if (!tableEmpty) {
        table.pickUp();
        tableEmpty = true;
        players.stream().filter((player) -> (!player.hasCards())).forEach((player) -> {
          loosers.add(player);
        });
        loosers.stream().filter((player) -> (players.contains(player))).forEach((player) -> {
          players.remove(player);
        });
        if (players.size() < 2) {
          winner = players.get(0);
        }
      }
    } else {
      throw new IllegalStateException("Vous devez initialiser une partie pour pouvoir jouer");
    }
  }

  public void removePlayer(String name) {
    if (runningGame) {
      throw new IllegalStateException("Un joueur ne peut pas être retiré en cours de partie");
    } else {
      for (Player player : players) {
        if (player.getName().equals(name)) {
          players.remove(player);
          break;
        }
      }
    }
  }

  public void removePlayer(Player player) {
    if (runningGame) {
      throw new IllegalStateException("Un joueur ne peut pas être retiré en cours de partie");
    } else {
      players.remove(player);
    }
  }

  private void reset() {
    if (loosers.size() > 0) {
      players.addAll(loosers);
    }
    loosers.clear();
    players.stream().forEach((player) -> {
      player.clearHeap();
    });
    runningGame = false;
    winner = null;
  }
}
