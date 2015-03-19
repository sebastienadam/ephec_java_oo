package E023_WriteThreadInterrupt;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Write extends Thread {

  String message;

  public Write(String message) {
    this.message = message;
  }

  @Override
  public void run() {
    while (true) {
      if (interrupted()) {
        break;
      } else {
        System.out.println(message);
        try {
          sleep(Math.round(Math.random() * 100));
        } catch (InterruptedException ex) {
          break;
        }
      }
    }
  }
}
