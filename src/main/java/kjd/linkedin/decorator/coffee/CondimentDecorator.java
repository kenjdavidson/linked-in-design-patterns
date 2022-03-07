package kjd.linkedin.decorator.coffee;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage, String description, Double cost) {
        super(description, cost);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "; " + description;
    }

    @Override
    public Double getCost() {
        return getCost() + beverage.getCost();
    }
    
}
