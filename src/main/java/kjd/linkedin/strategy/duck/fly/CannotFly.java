package kjd.linkedin.strategy.duck.fly;

public class CannotFly implements FlyBehaviour {

    @Override
    public String fly() {
        return "Cannot fly";
    }
    
}
