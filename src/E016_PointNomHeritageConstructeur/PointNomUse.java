/*
 * Vous disposez de la classe 'Point'. Réalisez une classe 'PointNom' dérivée de
 * 'Point' permettant de manipuler des points définis par deux coordonnées (int)
 * et un nom (caractère). On prévoira les méthodes suivantes:
 *   - un constructeur pour définir les coordonnées et le nom d'un objet de type
 *     'PointNom';
 *   - 'affCoordNom' pour afficher les coordonnées et le nom d'un objet de type
 *     'PointNom'.
 * Écrire un petit programme utilisant la classe 'PointNom'.
 */
package E016_PointNomHeritageConstructeur;

public class PointNomUse {

  public static void main(String[] args) {
    PointNom pn = new PointNom(4, 6, 'x');
    pn.affCoordNom();
  }
}
