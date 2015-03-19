package E019_PointException;

public class Point {
  private int x;
  private int y;
  
  public Point(int x, int y) throws PointException {
    if(x < 0 || y < 0) {
      throw new PointException("Les coordonnées ne peuvent être négaitves");
    } else {
      this.x = x;
      this.y = y;
    }
  }

  @Override
  public String toString() {
    return "Coord : (" + x + "," + y + ")";
  }
}
