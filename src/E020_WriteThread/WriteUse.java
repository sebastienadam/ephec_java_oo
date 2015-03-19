package E020_WriteThread;

public class WriteUse {

  public static void main(String[] args) {
    Write t1 = new Write("| Bonjour", 100);
    Write t2 = new Write("- Bonsoir", 120);
    Write t3 = new Write("", 50);
    
    t1.start();
//    t1.run();
    t2.start();
//    t2.run();
    t3.start();
//    t3.run();
    /*
     * Avec l'appel de la méthode 'run()', les traitements seront exécutés dans
     * l'ordre, il n'y aura pas d'exécution concurrente.
     */
  }
}
