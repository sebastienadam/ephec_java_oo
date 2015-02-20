/*
 * Créer une classe permettant de manipuler un point d’un axe, repéré par une
 * abscisse (de type 'int'). On devra pouvoir effectuer des changements 
 * d’origine, en conservant en permanence l’abscisse d’une origine courante
 * (initialement 0). On prévoira simplement les méthodes suivantes:
 *   - constructeur, recevant en argument l’abscisse "absolue" du point (c’est-
 *     à-dire repérée par rapport au point d’origine 0 et non par rapport à
 *     l’origine courante),
 *   - 'affiche' qui imprime à la fois l’abscisse de l’origine courante et
 *     l’abscisse du point par rapport à cette origine,
 *   - 'setOrigine' qui permet de définir une nouvelle abscisse pour l’origine
 *     (exprimée de façon absolue et non par rapport à l’origine courante),
 *   - 'getOrigine' qui permet de connaître l’abscisse de l’origine courante. 
 * Écrivez aussi un petit programme de test (TstOrig) qui fournira les résultats
 * suivants:
 * Point a - abscisse = 3
 * relative a une origine d'abscisse 0
 * Point b - abscisse = 12
 * relative a une origine d'abscisse 0
 * On place l'origine en 3
 * Point a - abscisse = 0
 * relative a une origine d'abscisse 3
 * Point b - abscisse = 9
 * relative a une origine d'abscisse 3
 */
package E010_ChampsMethodesClassePoint;

public class TstOrig {

  public static void main(String[] args) {
    System.out.println("Création de A:");
    Point A = new Point(3);
    System.out.println("A: "+A);
    System.out.println("Création de B:");
    Point B = new Point(12);
    System.out.println("B: "+B);
    System.out.println("Déplacement de l'orignie à 3");
    Point.setOrigin(3);
    System.out.println("A: "+A);
    System.out.println("B: "+B);
  }
}
