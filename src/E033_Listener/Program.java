package E033_Listener;

public class Program {
  public static void main(String[] args) {
    DataObserver listener = new DataObserver();
    DataModel d1 = new DataModel();
    d1.addObserver(listener);
    DataModel d2 = new DataModel();
    d2.addObserver(listener);
    DataModel d3 = new DataModel();
    d3.addObserver(listener);
    
    // nous devrions avoir des notifications
    d1.setVal(2);
    d2.setVal(5);
    d3.setVal(1);
    // il ne devrait plus avoir de notifications
    d1.setVal(2);
    d2.setVal(5);
    d3.setVal(1);
  }
}
