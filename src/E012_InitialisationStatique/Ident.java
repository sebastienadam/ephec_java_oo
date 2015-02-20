package E012_InitialisationStatique;

import E000_common.Keyboard;

public class Ident {
  private static int identMax;
  private int ident;
  
  static {
    identMax = Keyboard.readInt("Valeur initale d'identifiant : ", 0);
  }
  
  public Ident() {
    ident = identMax;
    Ident.identMax++;
  }
  
  public int getIdent() {
    return ident;
  }
  
  public static int getIdentMax() {
    return identMax;
  }
}
