package E033_Listener;

import java.util.Observable;
import java.util.Observer;

public class DataObserver implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    if (o.hasChanged()) {
      System.out.println(o + " a changé");
      o.deleteObserver(this);
    }
  }

}
