package JeuDeCartes;

public class Carte {
  private Valeur valeur;
  private Couleur couleur;
  
  public Carte(Valeur valeur, Couleur couleur) {
    this.valeur = valeur;
    this.couleur = couleur;
  }
  
  /**
   * Compare l'objet en cours avec une carte donnée.
   * 
   * @param carte la carte à comparer avec l'objet en cours.
   * @return -1 si 'carte' est supérieure à l'objet en cours, 0 si les deux
   *   cartes ont la même valeur et 1 si 'carte' est inférieure à l'objet en
   *   cours
   */
  public int compare(Carte carte) {
    return valeur.compareTo(carte.valeur);
  }

  @Override
  public String toString() {
    return String.format("%s de %s", valeur, couleur);
  }
}
