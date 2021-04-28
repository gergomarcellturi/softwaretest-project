import models.Bar;
import models.Customer;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("Underage drinking of Josh in 'murica")
    public void ohNoJoshIsNotOldEnoughToDrinkInMurica() {
        assertFalse(this.baldEagleShotgunBar.serveCustomer(josh));
    }

    @Test
    @DisplayName("drinking of Josh in hungry")
    public void ohYeahJoshCanDrinkInHungary() {
        assertTrue(this.hussarBar.serveCustomer(josh));
    }

    @Test
    @DisplayName("lmao Amy can drink anywhere")
    public void holymollyAmyIsAnAlcoholic() {
        assertTrue(this.hussarBar.serveCustomer(amy));
        assertTrue(this.baldEagleShotgunBar.serveCustomer(amy));
    }

}
