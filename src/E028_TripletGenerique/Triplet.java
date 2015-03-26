/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E028_TripletGenerique;

/**
 *
 * @author Sébastien
 * @param <T>
 */
public class Triplet<T> {
  private final T first;
  private final T second;
  private final T third;
  
  public Triplet(T first, T second, T third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }
  
  public T getFirst() {
    return first;
  }
  
  public T getSecond() {
    return second;
  }
  
  public T getThird() {
    return third;
  }

  @Override
  public String toString() {
    return first.toString()+"|"+second.toString()+"|"+third.toString();
  }
}
