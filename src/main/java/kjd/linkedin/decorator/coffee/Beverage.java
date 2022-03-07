package kjd.linkedin.decorator.coffee;

import lombok.Getter;

public abstract class Beverage {
    @Getter
    protected String description;

    @Getter
    protected Double cost;

    public Beverage(String description, Double cost) {
        this.description = description;
        this.cost = cost;
    }
}
