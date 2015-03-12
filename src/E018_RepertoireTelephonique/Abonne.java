package E018_RepertoireTelephonique;

public class Abonne {
  private String nom;
  private String numero;
  
  public Abonne(String nom, String numero) {
    this.nom = nom;
    this.numero = numero;
  }
  
  public String getNom() {
    return nom;
  }
  
  public String getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return nom+" @ "+numero;
  }
}
