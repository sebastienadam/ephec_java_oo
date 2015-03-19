package E022_WriteRunnableStart;

public class WriteUse {

  public static void main(String[] args) {
    Write t1 = new Write("| Bonjour", 100);
    Write t2 = new Write("- Bonsoir", 120);
    Write t3 = new Write("", 50);
    
    t1.start();
    t2.start();
    t3.start();
  }
}
