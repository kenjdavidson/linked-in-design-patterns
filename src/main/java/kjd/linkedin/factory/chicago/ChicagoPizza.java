package kjd.linkedin.factory.chicago;

import kjd.linkedin.factory.Pizza;

public class ChicagoPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Put dough in deep dish");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 40 minutes");
    }
    
}
