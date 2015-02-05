/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E002_Point;

/**
 *
 * @author Sébastien
 */
public class PointUse {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Point p = new Point('P', 3.2);
    System.out.println("Nouveau point 'P' à l'abcisse 3,2 :");
    System.out.println(p);
    System.out.println("");
    p.translate(-4.1);
    System.out.println("Déplacement du point de -4,1 :");
    System.out.println(p);
  }
  
}
