import java.util.Optional;
import pattern.observer.Observer;
import pattern.observer.Publisher;
import pattern.singleton.DatenbankManager;

public class Main {

  public static void main(String[] args) {

    // Singleton
    DatenbankManager singleton = DatenbankManager.getInstance("mysqldb://localhost:3306");
   // System.out.println(singleton.getString());
    DatenbankManager instance = DatenbankManager.getInstance("uiwefzuiewfioewfo");
    System.out.println(instance.getString());


    // Observer
/*
    Publisher publisher = new Publisher();
    publisher.addObserver(new Observer("Fotograf1"));
    publisher.addObserver(new Observer("Fotograf2"));
    publisher.addObserver(new Observer("Fotograf3"));
    publisher.addObserver(new Observer("Fotograf4"));
    publisher.addObserver(new Observer("Fotograf5"));
    publisher.notifyAllObservers("Pinguin steht auf");

 */



    /*
    // Builder
    Burger b1 = new Burger();
    b1.addIngredient("Salad");
    b1.addIngredient("Tomato");
    b1.addIngredient("Cheese");
    b1.addIngredient("Onion");
    b1.addIngredient("Meat");
    b1.setBuns("Roggen");
    b1.setSauce("Ketchup");
    b1.printBurger();

    Car t = new Car().name("Audio").seats(3).price(200.00f);
    System.out.println("hii");

     */


  }
}