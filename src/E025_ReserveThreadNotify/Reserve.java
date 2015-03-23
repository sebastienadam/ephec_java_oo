package E025_ReserveThreadNotify;

public class Reserve extends Thread {

  private int stock = 500;

  public synchronized void puise(int v) throws InterruptedException {
    if (v <= stock) {
      System.out.print("-- on puise " + v);
      stock -= v;
      System.out.println(" et il reste " + stock);
    } else {
      System.out.println("** stock de " + stock + " insuffisnat pour puiser " + v);
      wait();
    }
  }

  public synchronized void ajoute(int v) {
    stock += v;
    System.out.println("++ on ajoute " + v + " et il y a maintenant " + stock);
    notifyAll();
  }
}
