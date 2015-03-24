package E025_ReserveThreadNotify;

import java.time.LocalTime;

public class Reserve extends Thread {

  private int stock = 500;

  public synchronized void puise(int v) throws InterruptedException {
    if (v <= stock) {
      System.out.print(LocalTime.now()+" -- on puise " + v);
      stock -= v;
      System.out.println(" et il reste " + stock);
    } else {
      System.out.println(LocalTime.now()+" ** stock de " + stock + " insuffisnat pour puiser " + v);
      wait();
    }
  }

  public synchronized void ajoute(int v) {
    stock += v;
    System.out.println(LocalTime.now()+" ++ on ajoute " + v + " et il y a maintenant " + stock);
    notifyAll();
  }
}
