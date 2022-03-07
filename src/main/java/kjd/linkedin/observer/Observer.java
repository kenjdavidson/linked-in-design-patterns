package kjd.linkedin.observer;

@FunctionalInterface
public interface Observer<R> {
    public void observed(R observed);
}
