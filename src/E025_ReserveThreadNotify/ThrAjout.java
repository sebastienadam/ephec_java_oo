package E025_ReserveThreadNotify;

public class ThrAjout extends Thread {
  private int delay;
  private Reserve r;
  private int vol;
  
  public ThrAjout(Reserve r, int vol, int delai) {
    this.delay = delai;
    this.r = r;
    this.vol = vol;
  }

  @Override
  public void run() {
    try {
      while (!interrupted()) {        
        r.ajoute(vol);
        sleep(delay);
      }
    } catch (InterruptedException e) {
    }
  }
}
