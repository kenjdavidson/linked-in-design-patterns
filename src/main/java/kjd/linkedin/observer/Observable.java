package kjd.linkedin.observer;

public interface Observable<T> {
    public boolean registerObserver(Observer<T> observer);
    public boolean removeObserver(Observer<T> observer);
}
