package kjd.linkedin.factory.chicago;

public class ChicagoVeggiePizza extends ChicagoPizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Mushrooms and Pepperoni!! No such thing as Veggie!!");
    }
    
}
