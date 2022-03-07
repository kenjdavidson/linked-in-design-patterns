package kjd.linkedin.adapter.duck;

import kjd.linkedin.strategy.duck.Duck;

/**
 * Implement the Turkey interface through the Duck.
 * 
 * @author kenjdavidson
 */
public class TurkeyAdapter extends Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public String quack() {
        return turkey.gobble();
    }

    @Override
    public String fly() {
        return turkey.fly();
    }

    @Override
    public void display() {
        System.out.println("Turkey");
    }    
}
