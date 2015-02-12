package E005_ChampsConstants;

/**
 *
 * @author Sébastien
 */
public class ChCt {

  private final float x;
  private final int n = 10;
  private final int p; // !ERREUR: p doit être initialisé

  public ChCt(float r) {
    x = r;
    p = 1; // correction de l'erreur
  }
  //.....
}
