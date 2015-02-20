package E011_ChampsMethodesClasseID;

public class Ident {
  private static int identMax = 0;
  private int ident;
  
  public Ident() {
    Ident.identMax++;
    ident = identMax;
  }
  
  public int getIdent() {
    return ident;
  }
  
  public static int getIdentMax() {
    return identMax;
  }
}
