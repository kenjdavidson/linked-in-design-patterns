package kjd.linkedin.strategy.duck;

import kjd.linkedin.strategy.duck.fly.FlyWithWings;
import kjd.linkedin.strategy.duck.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.setFlyBehaviour(new FlyWithWings());
        this.setQuckBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Redheaded Duck");
    }
    
}
