package E026_NombresThreadNotify;

import E000_common.Keyboard;

public class NombresUse {

  public static void main(String[] args) {
    Nombres nomb = new Nombres();
    Thread calc = new ThrChange(nomb);
    Thread aff = new ThrAff(nomb);
    System.out.println("Suite de carrés - tapez retour pour arrêter");
    calc.start();
    aff.start();
    Keyboard.readString("");
    calc.interrupt();
    aff.interrupt();
  }
  
}
