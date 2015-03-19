package E024_NumberThreadSynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Number {
  int value = 0;
  int square = 0;
  
  // public void compute() {
  synchronized public void compute() {
    value++;
    try {
      Thread.sleep(10);
    } catch (InterruptedException ex) {
      Logger.getLogger(Number.class.getName()).log(Level.SEVERE, null, ex);
    }
    square = value*value;
  }
  
  // public void print() {
  synchronized public void print() {
    System.out.println("Le carré de "+value+" est : "+square);
  }
}
