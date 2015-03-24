package E026_NombresThreadNotify;


public class ThrAff extends Thread {
  private Nombres nomb;

  public ThrAff(Nombres nomb) {
    this.nomb = nomb;
  }

  @Override
  public void run() {
    try {
      while (!interrupted()) {        
        nomb.affiche();
        sleep(2);
      }
    } catch (InterruptedException e) {
    }
  }
}
