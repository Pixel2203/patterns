package pattern.singleton;

import java.util.Objects;

public final class Singleton {
  private static Singleton instance;
  private String savedString;

  private Singleton(String savedString) {
    this.savedString = savedString;
  }
  public static Singleton getInstance(String savedString){
    if(Objects.isNull(instance)){
      instance = new Singleton(savedString);
    }
    return instance;
  }
  public String getString() {
    return this.savedString;
  }
}
