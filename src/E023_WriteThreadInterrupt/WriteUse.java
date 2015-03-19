package E023_WriteThreadInterrupt;

import E000_common.Keyboard;
import java.io.IOException;

public class WriteUse {

  public static void main(String[] args) {
    Write t1 = new Write("Thread 1");
    Write t2 = new Write("Thread 2");
    Write t3 = new Write("Thread 3");
    
    t1.start();
    t2.start();
    t3.start();
    
    Keyboard.readString("Stop Thread 1");
    t1.interrupt();
    Keyboard.readString("Stop Thread 2");
    t2.interrupt();
    Keyboard.readString("Stop Thread 3");
    t3.interrupt();
  }
}
