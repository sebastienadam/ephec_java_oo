package E017_PointNomRedefinition;

public class PointNom extends Point {
  private char nom;
  
  public PointNom(int x, int y, char nom) {
    super(x, y);
    this.nom = nom;
  }
  
  public void seteNom(char nom) {
    this.nom = nom;
  }

  @Override
  public void affiche() {
		System.out.println("Nom point : " + this.nom);
    super.affiche();
  }
}
