package models;

public class Bar {
    int requiredAge;
    String country;

    public String serveCustomer(Customer customer) {
        if (customer.age < this.requiredAge) {
            return String.format("Hey, %s! You can't drink here! This is a(n) %s bar! Get out of here you little punk!", customer.name, this.country);
        } else {
            return String.format("Come 'ere %s! First one's on the house", customer.name);
        }
    }
}
