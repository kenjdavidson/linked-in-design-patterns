package kjd.linkedin.factory.newyork;

public class NewYorkVeggiePizza extends NewYorkPizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Mushrooms and Peppers and Spinach, on my!");
    }
    
}
