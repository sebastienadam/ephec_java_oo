package E016_PointNomHeritageConstructeur;

public class PointNom extends Point {
  private char nom;

  public PointNom(int x, int y, char nom) {
    super(x,y);
    this.nom = nom;
  }
  
  public void affCoordNom() {
		System.out.println("Nom du point : " + this.nom);
    super.affCoord();
  }
}
