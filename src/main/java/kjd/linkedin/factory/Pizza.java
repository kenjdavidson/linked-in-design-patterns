package kjd.linkedin.factory;

public abstract class Pizza {
    abstract public void prepare();
    abstract public void bake();

    public void cut() {
        System.out.println("Cut slices");
    }

    public void box() {
        System.out.println("Boxed");
    }
}
