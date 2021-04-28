import models.Bar;
import models.Customer;

public class Drinking {

  public static void main(String[] args) {
    Customer josh = new Customer("Josh", 19);
    Bar bar = new Bar("american", 21);
    bar.serveCustomer(josh);
  }
}
