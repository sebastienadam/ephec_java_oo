/*
 * Vous disposez de la classe 'Point'. Réalisez une classe 'PointNom' dérivée de
 * 'Point' permettant de manipuler des points définis par deux coordonnées (int)
 * et un nom (caractère). On prévoira les méthodes suivantes:
 *   - 'setPointNom' pour définir les coordonnées et le nom d'un objet de type
 *     'PointNom';
 *   - 'setNom' pour définir seulement le nom d'un tel objet;
 *   - 'affCoordNom' pour afficher les coordonnées et le nom d'un objet de type
 *     'PointNom'.
 * Écrire un petit programme utilisant la classe 'PointNom'.
 */
package E015_PointNomHeritage;

public class PointNomUse {

  public static void main(String[] args) {
    PointNom pn = new PointNom();
    pn.setPointNom(5, 6, 'a');
    pn.affCoordNom();
    pn.setNom('b');
    pn.deplace(2, -2);
    pn.affCoordNom();
    pn.setPoint(5, 6);
    pn.affCoordNom();
  }
}
