package E003_Safe;

/**
 *
 * @author Sébastien
 */
public class SafeUse {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Key key = new Key();
    Key key2 = new Key();
    Padlock padlock = new Padlock(key);
    Safe safe = new Safe(padlock);
    System.out.println("Création du coffre");
    System.out.println(safe.getStatus());
    System.out.println();
    System.out.println("Fermeture du coffre (simple)");
    safe.close();
    System.out.println(safe.getStatus());
    System.out.println();
    System.out.println("Ouverture du coffre (sans la clé)");
    safe.open();
    System.out.println(safe.getStatus());
    System.out.println();
    System.out.println("Fermeture du coffre (à clé)");
    safe.close(true);
    System.out.println(safe.getStatus());
    System.out.println();
    System.out.println("Ouverture du coffre (sans la clé)");
    safe.open();
    System.out.println(safe.getStatus());
    System.out.println();
    System.out.println("Ouverture du coffre (avec la clé)");
    safe.open(key);
    System.out.println(safe.getStatus());
    System.out.println();
    System.out.println("Fermeture du coffre (à clé)");
    safe.close(true);
    System.out.println(safe.getStatus());
    System.out.println();
    System.out.println("Ouverture du coffre (avec une mauvaise clé)");
    safe.open(key2);
    System.out.println(safe.getStatus());
    System.out.println();
    
  }
  
}
