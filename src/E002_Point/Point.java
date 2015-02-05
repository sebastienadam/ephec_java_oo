/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E002_Point;

import java.text.DecimalFormat;

/**
 *
 * @author Sébastien
 */
public class Point {
  private char name;
  private double abscissa;
  static final private DecimalFormat df  = new DecimalFormat();
  {
    df.setMaximumFractionDigits(8);
  }
  
  public Point(char name, double abscissa) {
    this.name = name;
    this.abscissa = abscissa;
  }

  public double getPosition() {
    return abscissa;
  }
  public double translate(double distance) {
    abscissa += distance;
    return abscissa;
  }
  
  @Override
  public String toString() {
    return name+"("+df.format(abscissa)+")";
  }
}
