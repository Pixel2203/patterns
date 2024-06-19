package pattern.builder;

public class Car {
  private String name;
  private int seats;
  private float price;

  public Car name(String name){
    this.name = name;
    return this;
  }
  public Car seats(int seats){
    this.seats = seats;
    return this;
  }
  public Car price(float price){
    this.price = price;
    return this;
  }
}
