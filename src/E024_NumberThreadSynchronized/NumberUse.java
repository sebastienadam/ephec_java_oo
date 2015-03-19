package E024_NumberThreadSynchronized;

import E000_common.Keyboard;

public class NumberUse {

  public static void main(String[] args) {
    Number num = new Number();
    ThrAff aff = new ThrAff(num);
    ThrCalc calc = new ThrCalc(num);
    
    aff.start();
    calc.start();
    Keyboard.readString("Press enter to stop...\n");
    aff.interrupt();
    calc.interrupt();
    
  }
}
