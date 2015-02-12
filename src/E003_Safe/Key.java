package E003_Safe;

import java.util.UUID;

/**
 *
 * @author Sébastien
 */
public class Key {
  String token;

  public Key() {
    token = UUID.randomUUID().toString();
  }
  
  public Key(String token) {
    this.token = token;
  }
  
  public String getToken() {
    return token;
  }
}
