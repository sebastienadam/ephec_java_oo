package E013_JeuDeNim;

public class Stack {
  private int content;
  
  public Stack(int content) {
    this.content = content;
  }
  
  public int getContent() {
    return content;
  }
  
  public int pop(int nb) {
    if(nb <= 0 || nb > 3 || nb > content) {
      throw new IllegalArgumentException("must be between 1 and 3 and can not be more than content");
    } else {
      content -= nb;
      return content;
    }
  }
  
  public boolean isEmpty() {
    return content == 0;
  }
}
