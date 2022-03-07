package kjd.linkedin.factory.chicago;

import kjd.linkedin.factory.Pizza;
import kjd.linkedin.factory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza create(String type) {
        switch(type) {
            case "Veggie": return new ChicagoVeggiePizza();
            default: return null;
        }
    }
    
}
