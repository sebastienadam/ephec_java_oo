/*
 * Créer une classe 'Repertoire' qui dispose des fonctionnalités suivantes:
 *  - constructeur recevant un argument de type entier précisant le nombre
 *    maximum d'abonnés que pourra contenir le répertoire (cette particularité
 *    évite d'avoir à se soucier d'une gestion dynamique du répertoire);
 *  - méthode 'addAbonne' permettant d'ajouter un nouvel abonné, elle renverra
 *    la valeur 'false' si le répertoire est plein, la valeur 'true' sinon;
 *  - méthode 'getNumero' fournissant le numéro associé à un nom d'abonné fourni
 *    en argument;
 *  - méthode 'getNAbonnes' qui fournit le nombre d'abonnés figurant dans le
 *    répertoire;
 *  - méthode 'getAbonne' fournissant l'abonné dont le rang est fourni en
 *    argument.
 */
package E018_RepertoireTelephonique;

public class RepertoireUse {
  public static void main(String[] args) {
    Repertoire rep = new Repertoire(5);
//    Abonne abos[] = new Abonne[6];
    System.out.println("Taille répertoire vide: "+rep.getNAbonnes());
//    abos[0] = new Abonne("Alain",   "+32 1 111 11 11");
//    abos[1] = new Abonne("Bernard", "+32 2 222 22 22");
//    abos[2] = new Abonne("Charles", "+32 3 333 33 33");
//    abos[3] = new Abonne("David",   "+32 4 444 44 44");
//    abos[4] = new Abonne("Éric",    "+32 5 555 55 55");
//    abos[5] = new Abonne("Fred",    "+32 6 666 66 66");
//    for(Abonne abo : abos) {
//      if(rep.addAbonne(abo)) {
//        System.out.println("Abonné "+abo+" ajouté");
//      } else {
//        System.out.println("Échec de l'ajout de "+abo);
//      }
//      System.out.println("Taille du répertoire: "+rep.getNAbonnes());
//    }
    Boolean again = true;
    int idx = 1;
    Abonne currAbonne;
    while (again) {
      currAbonne = new Abonne("Nom"+idx, "+32 2 123 45 6"+idx);
      again = rep.addAbonne(currAbonne);
      if(again) {
        System.out.println(currAbonne+" ajouté");
        idx++;
      } else {
        System.out.println("Échec de l'ajout de "+currAbonne);
      }
      System.out.println("Taille du répertoire : "+rep.getNAbonnes());
    }
//    String name = abos[(int)Math.round(Math.random()*abos.length)].getNom();
    String name = "Nom"+(int)Math.round(Math.random()*7);
    System.out.println("Le numéro de "+name+" est: "+rep.getNumero(name));
    idx = (int)Math.round(Math.random()*7);
    System.out.println("L'abonné à l'index "+idx+" est : "+rep.getAbonne(idx));
  }
}
