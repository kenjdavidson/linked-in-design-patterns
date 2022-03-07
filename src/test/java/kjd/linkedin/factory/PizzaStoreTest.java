package kjd.linkedin.factory;

import org.junit.Test;

import kjd.linkedin.factory.chicago.ChicagoPizzaStore;
import kjd.linkedin.factory.newyork.NewYorkPizzaStore;

public class PizzaStoreTest {
    @Test
    public void testChicagoPizza() {
        PizzaStore store = new ChicagoPizzaStore();
        store.order("Veggie");
    }

    @Test 
    public void testNewYorkPizza() {
        PizzaStore store = new NewYorkPizzaStore();
        store.order("Veggie");
    }
}
