/*
 * Réaliser une classe qui permet d’attribuer un numéro unique à chaque nouvel
 * objet créé (1 au premier, 2 au suivant...). On ne cherchera pas à réutiliser
 * les numéros d’objets éventuellement détruits. On dotera la classe uniquement
 * d’un constructeur, d’une méthode 'getIdent' fournissant le numéro attribué à
 * l’objet et d’une méthode 'getIdentMax' fournissant le numéro du dernier objet
 * créé.
 * 
 * Écrire aussi un petit programme d’essai ('TstIdent'). 
 */
package E011_ChampsMethodesClasseID;

public class TstIdent {

  public static void main(String[] args) {
    System.out.println("Nombre d'objets créés    : "+Ident.getIdentMax());
    System.out.println("Création du premier objet...");
    Ident Ia = new Ident();
    System.out.println("Nombre d'objets créés    : "+Ident.getIdentMax());
    System.out.println("Création du second objet...");
    Ident Ib = new Ident();
    System.out.println("Nombre d'objets créés    : "+Ident.getIdentMax());
    System.out.println("Création du troisième objet...");
    Ident Ic = new Ident();
    System.out.println("Nombre d'objets créés    : "+Ident.getIdentMax());
    System.out.println();
    System.out.println("Index du premier objet   : "+Ia.getIdent());
    System.out.println("Index du second objet    : "+Ib.getIdent());
    System.out.println("Index du troisième objet : "+Ic.getIdent());
  }
  
}
