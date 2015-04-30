package E029_BankAccountJavaFX;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BankAccount {
  private DoubleProperty solde = new SimpleDoubleProperty();
  
  public final double getSolde() {
    return solde.get();
  }
  
  public final void setSolde(double val) {
    solde.set(val);
  }
  
  public final DoubleProperty soldeProperty() {
    return solde;
  }
}
