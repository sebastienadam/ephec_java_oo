package E009_ChampsMethodesClasse;

public class A {

  static int f(int n) {
    // q = n; // q n'est pas statique et ne peut être accédé  depuis une méthode statique.
    return 0; // rajouté, une valeur de retour est requise si le type de la méthode n'est pas 'void'
  }

  void g(int n) {
    q = n;
    // p = n; // p est 'final' et a déjà été assignée
  }
  static private final int p = 20;
  private int q;
}
