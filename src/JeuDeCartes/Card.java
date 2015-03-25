package JeuDeCartes;

public class Card {

  private final Value value;
  private final Color color;

  public Card(Value value, Color color) {
    this.value = value;
    this.color = color;
  }

  /**
   * Compare l'objet en cours avec une carte donnée.
   *
   * @param card la carte à comparer avec l'objet en cours.
   * @return -1 si 'card' est supérieure à l'objet en cours, 0 si les deux
   * cartes ont la même valeur et 1 si 'card' est inférieure à l'objet en cours
   */
  public int compare(Card card) {
    if (card == null) {
      return 1;
    } else {
      return value.compareTo(card.value);
    }
  }

  /**
   * Détecte si l'objet en cours possède la même couleur et la même valeur que
   * l'objet donné.
   *
   * @param card la carte à comparer avec l'objet en cours.
   * @return 'true' si les deux cartes ont la même couleur et la même valeur et
   * 'false' sinon.
   */
  public boolean isSame(Card card) {
    return (this.color == card.color) && (this.value == card.value);
  }

  @Override
  public String toString() {
    return String.format("%s de %s", value, color);
  }
}
