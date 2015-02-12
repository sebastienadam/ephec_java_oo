/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E008_ConversionsArguments;

/**
 *
 * @author Sébastien
 */
public class TstConvArg {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    A a = new A(); // g (byte b)
    int n = 1;
    byte b = 1;
    float x = 1.0f;
    double y = 1.0;
    a.f(n, x);           // OK, types correspondent
    a.f(b + 3, x);       // OK, résultat addition = int, types correspondent
    a.f(b, x);           // OK, cast implicite de byte -> int possible
//    a.f(n, y);           // ERREUR, cast implicite de double -> float impossible
    a.f(n, (float) y);   // OK, cast explicite de double -> float
    a.f(n, 2 * x);       // OK 
//    a.f(n + 5, x + 0.5); // ERREUR, cast implicite de double -> float impossible
    a.g(b);              // OK, type correspond
//    a.g(b + 1);          // ERREUR, résultat addition est int et cast implicite vers byte impossible
    a.g(b++);            // OK, résultat incrémentation est byte, type correspond
//    a.g(3);             // ERREUR, cast implicite de int -> byte impossible
  }
}
