package pattern.singleton;

import java.util.Objects;

public final class DatenbankManager {
  private static DatenbankManager instance;
  private String savedString;

  private DatenbankManager(String savedString) {
    this.savedString = savedString;
  }



  public static DatenbankManager getInstance(String savedString){
    if(Objects.isNull(instance)){
      instance = new DatenbankManager(savedString);
    }
    return instance;
  }




  public String getString() {
    return this.savedString;
  }
}
