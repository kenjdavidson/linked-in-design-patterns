package kjd.linkedin.iterator.cafe;

import kjd.linkedin.iterator.Iterable;
import kjd.linkedin.iterator.Iterator;

public class CafeMenu implements Iterable<String> {

    private final static String[] ITEMS = {
        "Coffee",
        "Tee",
        "Breakfast Sandwich",
        "Sparkling Water"
    };

    @Override
    public Iterator<String> iterator() {
        return new CafeMenuIterator(ITEMS);
    }
    
}
