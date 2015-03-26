/*
 * Écrire une classe générique 'Triplet' permettant de manupuler des triplets
 * d'objets d'un même type. On la dotera:
 *   - d'un constructeur à trois arguments (les objets constituant le triplet).
 *   - de trois méthodes 'getPremier', 'getSecond', 'getTroisieme' permettant
 *     d'obtenir la référence de l'un des éléments du triplet.
 *   - d'une méthode 'affiche' affichant la valeur des éléments du triplet.
 *
 * Ecrire un petit programme utilisant cette classe générique pour instancier
 * quelques objets et exploiter les méthodes existantes.
 */
package E028_TripletGenerique;

import E002_Point.Point;

public class TripletUse {

  public static void main(String[] args) {
//    Triplet<String> tripletString = new Triplet<>("un", "deux", "trois");
    TripletH<String,String,String> tripletString = new TripletH<>("un", "deux", "trois");
    System.out.println("Contenu du triplet: "+tripletString);
//    Triplet<Point> tripletPoint = new Triplet<>(new Point('a', 5), new Point('b', 8), new Point('c', 1));
    TripletH<Point,Point,Point> tripletPoint = new TripletH<>(new Point('a', 5), new Point('b', 8), new Point('c', 1));
    System.out.println("Contenu du triplet: "+tripletPoint);
    TripletH<String,String,Point> tripletStringPoint = new TripletH<>("un", "deux", new Point('c', 1));
    System.out.println("Contenu du triplet: "+tripletStringPoint);
  }
  
}
