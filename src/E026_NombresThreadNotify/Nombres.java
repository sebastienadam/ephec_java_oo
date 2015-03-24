package E026_NombresThreadNotify;

import java.time.LocalTime;

public class Nombres {

  private int n = 1;
  private int carre;
  private boolean pret = false;

  public synchronized void calcul() throws InterruptedException {
    if (!pret) {
      n++;
      carre = n * n;
      pret = true;
      notifyAll();
    }
  }

  public synchronized void affiche() {
    try {
      if (pret) {
        System.out.println(LocalTime.now() + " " + n + " a pour carré " + carre);
        notifyAll();
        pret = false;
      } else {
        wait();
      }
    } catch (InterruptedException ex) {
    }
  }

  public boolean pret() {
    return pret;
  }
}
