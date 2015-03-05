/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E014_PointHeritage;

/**
 *
 * @author Sébastien
 */
public class PointA extends Point {
  @Override
  public String toString() {
    return String.format("(%d,%d)", this.getX(),this.getY());
  }
}
