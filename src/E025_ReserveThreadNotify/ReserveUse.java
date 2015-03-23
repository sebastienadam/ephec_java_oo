package E025_ReserveThreadNotify;

import E000_common.Keyboard;

public class ReserveUse {

  public static void main(String[] args) {
    Reserve r = new Reserve();
    ThrAjout ta1 = new ThrAjout(r, 100, 15);
    ThrAjout ta2 = new ThrAjout(r, 50, 20);
    ThrPuise tp = new ThrPuise(r, 300, 10);
    System.out.println("Suivi de stock --- faire entrée pour arrêter");
    ta1.start();
    ta2.start();
    tp.start();
    Keyboard.readString("");
    ta1.interrupt();
    ta2.interrupt();
    tp.interrupt();
  }
  
}
