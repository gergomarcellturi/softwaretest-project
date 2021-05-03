import static org.junit.jupiter.api.Assertions.*;

import models.Bar;
import models.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DrinkingTest {

  private Customer josh;
  private Customer amy;

  private Bar baldEagleShotgunBar;
  private Bar hussarBar;

  @BeforeEach
  public void setUp() {
    this.josh = new Customer("Josh", 19);
    this.amy = new Customer("Amy", 22);
    this.baldEagleShotgunBar = new Bar("american", 21);
    this.hussarBar = new Bar("hungarian", 18);
  }

  @Test
  @DisplayName("Underage drinking of Josh in 'murica should not be possible")
  public void ohNoJoshIsNotOldEnoughToDrinkInMurica() {
    assertFalse(this.baldEagleShotgunBar.serveCustomer(josh));
  }

  @Test
  @DisplayName("drinking of Josh in hungary should be possible")
  public void ohYeahJoshCanDrinkInHungary() {
    assertFalse(this.hussarBar.serveCustomer(josh));
  }

  @RepeatedTest(10)
  @DisplayName("drinking of Amy should be possible anywhere")
  public void holymollyAmyIsAnAlcoholic() {
    assertTrue(this.hussarBar.serveCustomer(amy));
    assertTrue(this.baldEagleShotgunBar.serveCustomer(amy));
  }
}
