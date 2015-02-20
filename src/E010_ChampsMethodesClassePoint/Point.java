package E010_ChampsMethodesClassePoint;

public class Point {
  private static int origin = 0;
  private int abscissa;
  
  public Point(int abscissa) {
    this.abscissa = abscissa;
  }
  
  public static int getOrigin() {
    return origin;
  }
  
  public static void setOrigin(int origin) {
    Point.origin = origin;
  }

  @Override
  public String toString() {
    return "@"+(abscissa-origin)+"<"+origin;
  }
}
