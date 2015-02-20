package E000_common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe permettant de lire des données introduite au clavier.
 */
public class Keyboard {
  
  /**
   * Affiche le message d'erreur.
   * @param e L'exception qui a été générée.
   */
  protected static void printErrorMessage(Exception e) {
    System.out.println("Erreur d'encodage ("+e.getMessage()+")");
  }
  
  /**
   * Lit un nombre de type "Double" au clavier.
   * @return Le nombre introduit au clavier.
   * @throws NumberFormatException
   * @throws IOException 
   */
  public static double readDouble () throws NumberFormatException,IOException {
    double x;   // valeur a lire
    String readLine = readString();
    x = Double.parseDouble(readLine);
    return x;
  }
  
  /**
   * Lit un nombre de type "Double" au clavier avec une invite. En cas d'erreur
   * de lecture, affiche un message d'erreur.
   * @param prompt L'invite affichée à l'écran.
   * @return       Le nombre introduit au clavier
   */
  public static double readDouble(String prompt) {
    double num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readDouble();
        break;
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }

  /**
   * Lit un nombre de type "Double" au clavier avec une invite et une valeur
   * minimale. En cas d'erreur de lecture, affiche un message d'erreur. Si la
   * valeur introduite est trop petite, le nombre est demandé à nouveau.
   * @param prompt L'invite affichée à l'écran.
   * @param min    La valeur minimale.
   * @return       Le nombre introduit au clavier
   */
  public static double readDouble(String prompt, double min) {
    double num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readDouble();
        if(num < min) {
          System.out.println("Minimum "+min+" !!!");
        } else {
          break;
        }
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }

  /**
   * Lit un nombre de type "Double" au clavier avec une invite et des valeurs
   * minimale et maximale. En cas d'erreur de lecture, affiche un message
   * d'erreur. Si la valeur introduite est trop petite ou trop grande, le nombre
   * est demandé à nouveau.
   * @param prompt L'invite affichée à l'écran.
   * @param min    La valeur minimale.
   * @param max    La valeur maximale.
   * @return       Le nombre lit au clavier.
   */
  public static double readDouble(String prompt, double min, double max) {
    double num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readDouble();
        if((num < min) || (num > max)) {
          System.out.println("Entre "+min+" et "+max+"!!!");
        } else {
          break;
        }
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }

  /**
   * Lit un nombre de type "Float" au clavier.
   * @return Le nombre introduit au clavier.
   * @throws NumberFormatException
   * @throws IOException 
   */
  public static float readFloat () throws NumberFormatException,IOException {
    float x;   // valeur a lire
    String readLine = readString();
    x = Float.parseFloat(readLine);
    return x;
  }
  
  /**
   * Lit un nombre de type "Float" au clavier avec une invite. En cas d'erreur
   * de lecture, affiche un message d'erreur.
   * @param prompt L'invite affichée à l'écran.
   * @return       Le nombre introduit au clavier
   */
  public static float readFloat (String prompt) {
    float num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readFloat();
        break;
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }
  
  /**
   * Lit un nombre de type "Float" au clavier avec une invite et une valeur
   * minimale. En cas d'erreur de lecture, affiche un message d'erreur. Si la
   * valeur introduite est trop petite, le nombre est demandé à nouveau.
   * @param prompt L'invite affichée à l'écran.
   * @param min    La valeur minimale.
   * @return       Le nombre introduit au clavier
   */
  public static float readFloat (String prompt, float min) {
    float num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readFloat();
        if(num < min) {
          System.out.println("Minimum "+min+" !!!");
        } else {
          break;
        }
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }
  
  /**
   * Lit un nombre de type "Float" au clavier avec une invite et des valeurs
   * minimale et maximale. En cas d'erreur de lecture, affiche un message
   * d'erreur. Si la valeur introduite est trop petite ou trop grande, le nombre
   * est demandé à nouveau.
   * @param prompt L'invite affichée à l'écran.
   * @param min    La valeur minimale.
   * @param max    La valeur maximale.
   * @return       Le nombre lit au clavier.
   */
  public static float readFloat (String prompt, float min, float max) {
    float num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readFloat();
        if((num < min) || (num > max)) {
          System.out.println("Entre "+min+" et "+max+"!!!");
        } else {
          break;
        }
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }
  
  /**
   * Lit un nombre de type "Int" au clavier.
   * @return Le nombre introduit au clavier.
   * @throws NumberFormatException
   * @throws IOException 
   */
  public static int readInt () throws NumberFormatException,IOException {
    int n;   // valeur a lire
    String readLine = readString();
    n = Integer.parseInt(readLine);
    return n;
  }

  /**
   * Lit un nombre de type "Int" au clavier avec une invite. En cas d'erreur de
   * lecture, affiche un message d'erreur.
   * @param prompt L'invite affichée à l'écran.
   * @return       Le nombre introduit au clavier
   */
  public static int readInt(String prompt) {
    int num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readInt();
        break;
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }

  /**
   * Lit un nombre de type "Int" au clavier avec une invite et une valeur
   * minimale. En cas d'erreur de lecture, affiche un message d'erreur. Si la
   * valeur introduite est trop petite, le nombre est demandé à nouveau.
   * @param prompt L'invite affichée à l'écran.
   * @param min    La valeur minimale.
   * @return       Le nombre introduit au clavier
   */
  public static int readInt(String prompt, int min) {
    int num = 0;
    while (true) {
      try {
        System.out.print(prompt);
        num = readInt();
        if(num < min) {
          System.out.println("Minimum "+min+" !!!");
        } else {
          break;
        }
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }

  /**
   * Lit un nombre de type "Int" au clavier avec une invite et des valeurs
   * minimale et maximale. En cas d'erreur de lecture, affiche un message
   * d'erreur. Si la valeur introduite est trop petite ou trop grande, le nombre
   * est demandé à nouveau.
   * @param prompt L'invite affichée à l'écran.
   * @param min    La valeur minimale.
   * @param max    La valeur maximale.
   * @return       Le nombre lit au clavier.
   */
  public static int readInt(String prompt, int min, int max) {
    int num;
    while (true) {
      try {
        System.out.print(prompt);
        num = readInt();
        if((num < min) || (num > max)) {
          System.out.println("Entre "+min+" et "+max+"!!!");
        } else {
          break;
        }
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
     }
    }
    return num;
  }

  public static int readInt(String prompt, int[] vals) {
    int num;
    boolean valid = false;
    while (true) {
      try {
        System.out.print(prompt);
        num = readInt();
        for (int i : vals) {
          if(i == num) {
            valid = true;
            break;
          }
        }
        if (valid) {
          break;
        } else {
          System.out.println("Valeur non admise !");
        }
      } catch (NumberFormatException | IOException e) {
        printErrorMessage(e);
      }
    }
    return num;
  }
  /**
   * Lit une chaîne de caractères au clavier.
   * @return La chaîne lue.
   * @throws IOException 
   */
  public static String readString () throws IOException {
    String readLine;
    InputStreamReader reader = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (reader);
    readLine = input.readLine();
    return readLine;
  }
  
  /**
   * Lit une chaîne de caractère au clavier avec un invite.
   * @param prompt L'invite affichée à l'écran.
   * @return       Le nombre lit au clavier.
   */
  public static String readString (String prompt) {
    String line;
    while (true) {
      try {
        System.out.print(prompt);
        line = readString();
        break;
      } catch (IOException e) {
        printErrorMessage(e);
      }
    }
    return line;
  }
}