package kjd.linkedin.factory.newyork;

import kjd.linkedin.factory.Pizza;

public class NewYorkPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Flatten");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20 mins");
    }
    
}
