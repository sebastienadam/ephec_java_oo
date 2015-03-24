package E026_NombresThreadNotify;

public class ThrChange extends Thread {
  private Nombres nomb;

  public ThrChange(Nombres nomb) {
    this.nomb = nomb;
  }

  @Override
  public void run() {
    try {
      while (!interrupted()) {        
        nomb.calcul();
        sleep(5);
      }
    } catch (InterruptedException e) {
    }
  }
}
