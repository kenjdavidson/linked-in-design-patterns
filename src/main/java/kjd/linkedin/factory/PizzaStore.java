package kjd.linkedin.factory;

public abstract class PizzaStore {
    public Pizza order(String type) {
        Pizza pizza = create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract public Pizza create(String type);
}
