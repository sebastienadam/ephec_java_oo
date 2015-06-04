package E035_CalculatorLambdaHash;

import java.util.HashMap;
import java.util.Random;

public class Program {

  public static void main(String[] args) {
    HashMap<String, Calculator> calculators = new HashMap<>();
    Random rnd = new Random(System.currentTimeMillis());
    double val1 = rnd.nextDouble() * 25.0;
    double val2 = rnd.nextDouble() * 25.0;
    
    calculators.put("+", (a, b) -> { return a + b; });
    calculators.put("-", (a, b) -> { return a - b; });
    calculators.put("*", (a, b) -> { return a * b; });
    calculators.put("/", (a, b) -> { return a / b; });
    calculators.put("hypot", (a, b) -> { return Math.hypot(a, b); });
    calculators.put("max", (a, b) -> { return Math.max(a, b); });
    calculators.put("min", (a, b) -> { return Math.min(a, b); });
    calculators.put("pow", (a, b) -> { return Math.pow(a, b); });
    calculators.put("root", (a, b) -> { return Math.pow(a, 1/b); });
    
    System.out.println("Opérations :");
    System.out.format("%.2f + %.2f = %.2f%n",val1,val2,calculators.get("+").compute(val1, val2));
    System.out.format("%.2f - %.2f = %.2f%n",val1,val2,calculators.get("-").compute(val1, val2));
    System.out.format("%.2f * %.2f = %.2f%n",val1,val2,calculators.get("*").compute(val1, val2));
    System.out.format("%.2f / %.2f = %.2f%n",val1,val2,calculators.get("/").compute(val1, val2));
    System.out.format("hypot(%.2f, %.2f) = %.2f%n",val1,val2,calculators.get("hypot").compute(val1, val2));
    System.out.format("max(%.2f, %.2f) = %.2f%n",val1,val2,calculators.get("max").compute(val1, val2));
    System.out.format("min(%.2f, %.2f) = %.2f%n",val1,val2,calculators.get("min").compute(val1, val2));
    System.out.format("pow(%.2f, %.2f) = %.2f%n",val1,val2,calculators.get("pow").compute(val1, val2));
    System.out.format("root(%.2f, %.2f) = %.2f%n",val1,val2,calculators.get("root").compute(val1, val2));
  }
}
