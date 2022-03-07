package kjd.linkedin.strategy.duck;

import kjd.linkedin.strategy.duck.fly.FlyBehaviour;
import kjd.linkedin.strategy.duck.quack.QuackBehaviour;

/**
 * If it flies like a duck and quacks like a duck (or even if it doesn't) it's a duck!
 * 
 * @author kenjdavidson
 */
public abstract class Duck {
    private FlyBehaviour flyBehaviour;

    private QuackBehaviour quackBehaviour;

    public abstract void display();    

    public void swim() {
        // Swims
    }    

    protected void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public String fly() {
        return flyBehaviour.fly();
    }

    protected void setQuckBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public String quack() {
        return quackBehaviour.quack();
    }
}
