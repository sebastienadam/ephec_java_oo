package E019_PointException;

public class PointUse {

  public static void main(String[] args) {
    Point p;
    try {
      p = new Point(-1, 0);
      System.out.println("Point créé");
    } catch (PointException e) {
      System.out.println("Échec de la création du point: "+e.getMessage());
    }
  }
  
}
