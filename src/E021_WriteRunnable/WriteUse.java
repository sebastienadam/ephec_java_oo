package E021_WriteRunnable;

public class WriteUse {

  public static void main(String[] args) {
    Write e1 = new Write("| Bonjour", 100);
    Write e2 = new Write("- Bonsoir", 120);
    Write e3 = new Write("", 50);
    
    Thread t1 = new Thread(e1);
    Thread t2 = new Thread(e2);
    Thread t3 = new Thread(e3);
    
    t1.start();
    t2.start();
    t3.start();
  }
}
