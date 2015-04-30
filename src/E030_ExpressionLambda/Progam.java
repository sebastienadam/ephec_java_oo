package E030_ExpressionLambda;
// attention examen

import java.util.Random;

public class Progam {

  public static int traite(int n, Calculator c) {
    return c.calcul(n);
  }

  public static void main(String[] args) {
    Calculator[] cacls = {x -> x * x, x -> 2 * x, x -> (int)Math.round(x / 3)};
    Random rnd = new Random();
    int val;
    for (int i = 0; i < 10; i++) {
      val = rnd.nextInt(101);
      for (Calculator cacl : cacls) {
        System.out.println(val + " : " + traite(val, cacl));
      }
    }
  }
  
}
