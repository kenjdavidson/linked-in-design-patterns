package kjd.linkedin.factory.newyork;

import kjd.linkedin.factory.Pizza;
import kjd.linkedin.factory.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    public Pizza create(String type) {
        switch(type) {
            case "Veggie": return new NewYorkVeggiePizza();
            default: return null;
        }
    }
    
}
