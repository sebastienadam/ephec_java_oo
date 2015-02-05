/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E003_Safe;

/**
 *
 * @author Sébastien
 */
public class Padlock {
  private Key key;
  private boolean opened;
  
  public Padlock(Key key) {
    if(key == null) {
      throw new IllegalArgumentException("key ne peut être null");
    }
    this.key = key;
    opened = true;
  }
  
  public void close() {
    opened = false;
  }
  
  public boolean open(Key key) {
    if (!opened && key != null) {
      opened = (key.getToken() == this.key.getToken());
    }
    return opened;
  }
  
  public boolean isOpen(){
    return opened;
  }
}
