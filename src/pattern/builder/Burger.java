package pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {
  private List<String> ingredients;
  private String sauce;
  private String buns;

  public Burger(){
    this.ingredients = new ArrayList<>();
  }
  public void addIngredient(String e) {
    this.ingredients.add(e);
  }
  public void setSauce(String sauce){
    this.sauce = sauce;
  }
  public void setBuns(String buns){
    this.buns = buns;
  }
  public void printBurger() {
    System.out.println("I am a burger with ingredients:");
    ingredients.forEach(s -> System.out.println("%s,".formatted(s)));
    System.out.println("and with sauce: " + this.sauce);
    System.out.println("and with buns:" + this.buns);
  }

}



