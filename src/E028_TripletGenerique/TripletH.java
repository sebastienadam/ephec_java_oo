package E028_TripletGenerique;

/**
 *
 * @author Sébastien
 * @param <T>
 * @param <U>
 * @param <V>
 */
public class TripletH<T, U, V> {
  private final T first;
  private final U second;
  private final V third;
  
  public TripletH(T first, U second, V third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }
  
  public T getFirst() {
    return first;
  }
  
  public U getSecond() {
    return second;
  }
  
  public V getThird() {
    return third;
  }

  @Override
  public String toString() {
    return first.toString()+"|"+second.toString()+"|"+third.toString();
  }
}
