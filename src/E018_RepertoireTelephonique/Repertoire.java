package E018_RepertoireTelephonique;

import java.util.ArrayList;

public class Repertoire {
  private ArrayList<Abonne> abonnes = new ArrayList<>();
  private int maxAbonnes;
  
  public Repertoire(int maxAbonnes) {
    this.maxAbonnes = maxAbonnes;
  }
  
  public Boolean addAbonne(Abonne abonne) {
    if(abonnes.size() >= maxAbonnes) {
      return false;
    } else {
      abonnes.add(abonne);
      return true;
    }
  }
  
  public String getNumero(String nom) {
    if(abonnes.isEmpty()) {
      return null;
    } else {
      for(Abonne current : abonnes) {
        if(current.getNom().equals(nom)) {
          return current.getNumero();
        }
      }
      return null;
    }
  }
  
  public int getNAbonnes() {
    return abonnes.size();
  }
  
  public Abonne getAbonne(int idx) {
    try {
      return abonnes.get(idx);
    } catch (Exception e) {
      return null;
    }
  }
}
