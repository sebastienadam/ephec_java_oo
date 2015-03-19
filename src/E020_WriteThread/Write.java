package E020_WriteThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Write extends Thread {
  String message;
  int times;
  
  public Write(String message, int times) {
    this.message = message;
    this.times = times;
  }

  @Override
  public void run() {
    for (int i = 0; i < times; i++) {
      try {
        System.out.format("%8d: %s%n",(i+1),message);
        sleep(Math.round(Math.random() * 100));
      } catch (InterruptedException ex) {
        Logger.getLogger(Write.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
}
