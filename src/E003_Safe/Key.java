/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
