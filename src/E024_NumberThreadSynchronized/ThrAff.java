package E024_NumberThreadSynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrAff extends Thread {
  Number num;
  
  public ThrAff(Number num) {
    this.num = num;
  }

  @Override
  public void run() {
    while (true) {      
      if (interrupted()) {
        break;
      } else {
        num.print();
        try {
          sleep(75);
        } catch (InterruptedException ex) {
          break;
        }
      }
    }
  }
}
