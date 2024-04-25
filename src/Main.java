import pattern.singleton.Singleton;

public class Main {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance("hi");
    System.out.println(singleton.getString());
  }
}