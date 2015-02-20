package E009_ChampsMethodesClasse;

public class EssaiA {
	public static void main(String args[]) {
		A a = new A();
		int n = 5;
		a.g(n);
		a.f(n);  // devrait plutôt être: A.f(n);
		// f(n); // 'f' n'est pas définie dans EssaiA;
	}}
