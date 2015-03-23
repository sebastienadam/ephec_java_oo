package E025_ReserveThreadNotify;

public class ThrPuise extends Thread {
  private int delay;
  private Reserve r;
  private int vol;
  
  public ThrPuise(Reserve r, int vol, int delai) {
    this.delay = delai;
    this.r = r;
    this.vol = vol;
  }

  @Override
  public void run() {
    try {
      while (!interrupted()) {        
        r.puise(vol);
        sleep(delay);
      }
    } catch (InterruptedException e) {
    }
  }
}
