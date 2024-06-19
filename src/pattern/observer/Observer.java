package pattern.observer;

public class Observer {
  private String observerName;

  public Observer(String name){
    this.observerName = name;
  }


  public void notify(String message) {
    System.out.println("%s I have been notified: %s".formatted(this.observerName, message));
  }
}
