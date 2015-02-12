package E004_InitialisationObjet;

/**
 *
 * @author Sébastien
 */
public class A {

  public A(int coeff) {
    nbre *= coeff;
    nbre += decal;
  }

  public void affiche() {
    System.out.println("nbre = " + nbre + " decal = " + decal);
  }
  private int nbre = 20;
  private int decal;

}
