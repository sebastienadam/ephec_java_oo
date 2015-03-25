package JeuBataille;

public class NotEnoughtPlayersException extends Exception {

  /**
   * Creates a new instance of <code>NotEnoughtPlayersException</code> without
   * detail message.
   */
  public NotEnoughtPlayersException() {
  }

  /**
   * Constructs an instance of <code>NotEnoughtPlayersException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public NotEnoughtPlayersException(String msg) {
    super(msg);
  }
}
