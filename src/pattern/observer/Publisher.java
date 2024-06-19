package pattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Publisher {
  private List<Observer> observers;

  public Publisher(){
    this.observers = new ArrayList<>();
  }
  public void notifyAllObservers(String message){
    observers.forEach(observer -> observer.notify(message));
  }
  public void addObserver(Observer o){
    this.observers.add(o);
  }
}
