/*
 * Ecrivez le code de la méthode sort(int[], sample)
 * int[] val est votre tableau de valeurs à trier
 * sample.exchangeValues(i, j) permet d'échanger les valeurs des deux positions i et j
 * sample.setValue(i, val); permet d'assigner la valeur val à la position i
 */
package E001_Sorter;

/**
 *
 * @author fredericferrant
 */
class Sorter {

  static void sort(int[] val, SortAnalyzer sample) {
    new Thread() {
      @Override
      public void run() {
        /* 
         * Ajoutez ici votre code
         */
//        bubbleSort(val, sample);
        selectionSort(val, sample);
      }
    }.start();
  }

  /**
   * Tri à bulle
   * @author: Sébastien Adam
   * @param val
   * @param sample 
   */
  private static void bubbleSort(int[] val, SortAnalyzer sample) {
    int len = val.length;
    boolean unchanged;
    for (int i = len-1; i > 0; i--) {
      unchanged = true;
      for (int j = 0; j < i; j++) {
        if (val[j] > val[j+1]) {
          sample.exchangeValues(j, j+1);
          unchanged = false;
        }
      }
      if (unchanged) {
        break;
      }
    }
  }
  
  /**
   * @author: Sébastien Adam
   * @param val
   * @param sample 
   */
  private static void selectionSort(int[] val, SortAnalyzer sample) {
    int len = val.length;
    for (int i = 0; i < len - 1; i++) {
      int min = i;
      for (int j = i+1; j < len; j++) {
        if (val[j] < val[min]) {
          min = j;
        }
      }
      if (min != i) {
        sample.exchangeValues(i, min);
      }
    }
  }
}
