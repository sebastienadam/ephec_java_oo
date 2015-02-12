package E006_AffectationComparaisonObjets;

/**
 *
 * @author Sébastien
 */
public class TstEnt {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Entier n1 = new Entier(2);  // on crée un objet de type Entier et on l'initialisé à 2
    System.out.print("n1 = ");
    n1.imprime();               // on affiche la valeur de l'objet (2)
    Entier n2 = new Entier(5);  // on crée un deuxième objet de type Entier et on l'initialise à 5
    System.out.print("n2 = ");
    n2.imprime();               // on affiche la valeur du deuxième objet (5)
    n1.incr(3);                 // on incrémente le premier objet de 3, sa valeur devient 5
    System.out.print("n1 = ");
    n1.imprime();               // on affiche la valeur du premier objet (5)
    System.out.println("n1 == n2 est " + (n1 == n2)); // on test si n1 et n2 référencent le même objet (non)
    System.out.println("n1 == n2 est " + (n1.equals(n2))); // on test si n1 et n2 ont la même valeur (surcharge méthode dans classe Entier)

    n1 = n2;                    // n1 référence maintenant le deuxième objet, tout comme n2
    n2.incr(12);                // on incrémente le deuxième objet de 12, sa valeur devient 17
    System.out.print("n2 = ");
    n2.imprime();               // on affiche le deuxième objet
    System.out.print("n1 = ");
    n1.imprime();               // on affiche le deuxième objet
    System.out.println("n1 == n2 est " + (n1 == n2));
                                // on test si n1 et n2 référencent le même objet (oui)
  }
}