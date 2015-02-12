package E003_Safe;

/**
 *
 * @author Sébastien
 */
public class Safe {
  private Padlock padlock;
  private boolean opened;
  
  public Safe(Padlock padlock) {
    this.padlock = padlock;
  }
  
  public boolean open() {
    return open(null);
  }
  
  public boolean open(Key key) {
    if (padlock.isOpen()) {
      opened = true;
    } else {
      opened = padlock.open(key);
    }
    return opened;
  }
  
  public void close() {
    close(false);
  }
  
  public void close(boolean secure) {
    if (secure) {
      padlock.close();
    }
    opened = false;
  }

  public boolean isOpen() {
    return opened;
  }
  
  public boolean isSecure() {
    return (!isOpen() && !padlock.isOpen());
  }
  
  public String getStatus() {
    if (isOpen()) {
      return "Le coffre est OUVERT";
    } else {
      if (isSecure()) {
        return "Le coffre est FERMÉ À CLÉ";
      } else {
        return "Le coffre est FERMÉ, mais pas à clé";
      }
    }
  }
}
