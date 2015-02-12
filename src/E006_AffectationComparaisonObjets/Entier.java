package E006_AffectationComparaisonObjets;

/**
 *
 * @author Sébastien
 */
public class Entier {

  private int n;

  public Entier(int nn) {
    n = nn;
  }

  public void incr(int dn) {
    n += dn;
  }

  public void imprime() {
    System.out.println(n);
  }

  // méthode ajoutée pour permetre de comparer avec un autre Entier
  public boolean equals(Entier e) {
    return (e.n == this.n);
  }
}
