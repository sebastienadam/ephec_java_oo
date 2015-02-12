package E007_AccesChampsPrives;

/**
 *
 * @author Sébastien
 */
class Point {

  Point(int abs, int ord) {
		x = abs;
		y = ord;
  }

  /* méthode supprimée
  void affiche() {
		System.out.println("Je suis un point de coordonnees " + x + " " + y);
  }
  */

  void deplace(int dx, int dy) {
		x += dx;
		y += dy;
  }
  
  // méthode ajoutée
  double abscisse() {
    return x;
  }
  
  // méthode ajoutée
  double ordonnee() {
    return y;
  }

  private double x; // abscisse
	private double y; // ordonnee
}
