package E033_Listener;

import java.util.Observable;

public class DataModel extends Observable {
  private int val;

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
    setChanged();
    notifyObservers();
  }
}
