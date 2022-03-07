package kjd.linkedin.decorator.pizza;

public class PizzaTopping extends Pizza {
    Pizza pizza;

    public PizzaTopping(String description, Double cost, Pizza pizza) {
        super(description, cost);
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "; " + description;
    }

    @Override 
    public Double getCost() {
        return cost + pizza.getCost();
    }
}
