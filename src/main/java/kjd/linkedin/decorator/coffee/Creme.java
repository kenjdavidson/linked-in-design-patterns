package kjd.linkedin.decorator.coffee;

public class Creme extends CondimentDecorator {
    public Creme(Beverage beverage) {
        super(beverage, "Creme", 0.5);
    }
}
