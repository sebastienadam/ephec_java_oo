package E007_AccesChampsPrives;

/**
 *
 * @author Sébastien
 */
public class TstPnt {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Point a;
    a = new Point(3, 5);
//    a.affiche(); // on a supprimé la méthode 'affiche'
    // la ligne suivante remplace la ligne précédente
    System.out.println("Je suis un point de coordonnees " + a.abscisse() + " " + a.ordonnee());
    a.deplace(2, 0);
//    a.affiche(); // on a supprimé la méthode 'affiche'
    // la ligne suivante remplace la ligne précédente
    System.out.println("Je suis un point de coordonnees " + a.abscisse() + " " + a.ordonnee());
    Point b = new Point(6, 8);
//    b.affiche(); // on a supprimé la méthode 'affiche'
    // la ligne suivante remplace la ligne précédente
    System.out.println("Je suis un point de coordonnees " + b.abscisse() + " " + b.ordonnee());
  }
}
