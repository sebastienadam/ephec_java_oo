package E024_NumberThreadSynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrCalc extends Thread {
  Number num;
  
  public ThrCalc(Number num) {
    this.num = num;
  }

  @Override
  public void run() {
    while (true) {      
      if (interrupted()) {
        break;
      } else {
        num.compute();
        try {
          sleep(50);
        } catch (InterruptedException ex) {
          break;
        }
      }
    }
  }
}
