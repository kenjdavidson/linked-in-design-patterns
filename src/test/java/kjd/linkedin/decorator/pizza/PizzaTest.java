package kjd.linkedin.decorator.pizza;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PizzaTest {
    @Test 
    public void testEverythingThinCrustPizza() {
        Pizza pizza = new Olives(new Peppers(new Cheese(new ThinCrustPizza())));
        assertEquals("Thin crust pizza; Cheese; Peppers; Olives", pizza.getDescription());
        assertTrue(14.99 == pizza.getCost());
    }
}
