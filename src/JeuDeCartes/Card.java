package JeuDeCartes;

public class Card {
  private Value value;
  private Color color;
  
  public Card(Value value, Color color) {
    this.value = value;
    this.color = color;
  }
  
  /**
   * Compare l'objet en cours avec une carte donnée.
   * 
   * @param carte la carte à comparer avec l'objet en cours.
   * @return -1 si 'carte' est supérieure à l'objet en cours, 0 si les deux
   *   cartes ont la même valeur et 1 si 'carte' est inférieure à l'objet en
   *   cours
   */
  public int compare(Card carte) {
    return value.compareTo(carte.value);
  }

  @Override
  public String toString() {
    return String.format("%s de %s", value, color);
  }
}
