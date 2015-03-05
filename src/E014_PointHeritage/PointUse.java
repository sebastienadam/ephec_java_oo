/*
 * On dispode de la classe 'Point'. Réalisez la classe 'PointA', dérivée de
 * 'Point' disposant d'une méthode 'affiche' affichant (en fenêtre console) les
 * coordonnées d'un point. Écrire un petit programme utilisant les deux classes
 * 'Point' et 'PointA'.
 */
package E014_PointHeritage;

/**
 *
 * @author Sébastien
 */
public class PointUse {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Point p = new Point();
    PointA pa = new PointA();
    p.initialize(6, 4);
    System.out.println("Position de p : ("+p.getX()+","+p.getY()+")");
    p.deplace(1, -1);
    System.out.println("Position de p : ("+p.getX()+","+p.getY()+")");
    pa.initialize(6, 4);
    System.out.println("Position de pa: "+pa);
    pa.deplace(1, -1);
    System.out.println("Position de pa: "+pa);
  }
  
}
