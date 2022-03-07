package kjd.linkedin.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Subject<T> implements Observable<T> {
    List<Observer<T>> observers = Collections.synchronizedList(new ArrayList<>());

    @Override
    public boolean registerObserver(Observer<T> observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer<T> observer) {
        return observers.remove(observer);
    }

    public void notifyObservers(T observed) {
        Iterator<Observer<T>> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().observed(observed);
        }
    }
}
