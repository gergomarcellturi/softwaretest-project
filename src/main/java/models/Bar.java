package models;

public class Bar {
  int requiredAge;
  String country;

  public Bar(String country, int requiredAge) {
    this.requiredAge = requiredAge;
    this.country = country;
  }

  public boolean serveCustomer(Customer customer) {
    if (customer.age < this.requiredAge) {
      System.out.printf(
          "Hey, %s! You can't drink here :(! This is a(n) %s bar! Get out of here you little punk!%n",
          customer.name, this.country);
      return false;
    } else {
      System.out.printf("Come 'ere %s! First one's on the house", customer.name);
      return true;
    }
  }
}
