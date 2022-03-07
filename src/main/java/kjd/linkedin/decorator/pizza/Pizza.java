package kjd.linkedin.decorator.pizza;

public abstract class Pizza {
    String description;
    Double cost;

    public Pizza(String description, Double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public Double getCost() {
        return cost;
    }
}
