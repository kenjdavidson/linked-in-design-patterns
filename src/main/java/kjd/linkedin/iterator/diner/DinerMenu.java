package kjd.linkedin.iterator.diner;

import java.util.Arrays;
import java.util.List;

import kjd.linkedin.iterator.Iterable;
import kjd.linkedin.iterator.Iterator;

public class DinerMenu implements Iterable<String> {

    private static final List<String> ITEMS = Arrays.asList("Burger", "Hotdog", "Desert");

    @Override
    public Iterator<String> iterator() {
        return new DinerMenuIterator(ITEMS);
    }
    
}
