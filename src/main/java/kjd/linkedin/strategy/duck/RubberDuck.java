package kjd.linkedin.strategy.duck;

import kjd.linkedin.strategy.duck.fly.CannotFly;
import kjd.linkedin.strategy.duck.quack.Squeek;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setFlyBehaviour(new CannotFly());
        this.setQuckBehaviour(new Squeek());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Ducky");
    }
    
}
