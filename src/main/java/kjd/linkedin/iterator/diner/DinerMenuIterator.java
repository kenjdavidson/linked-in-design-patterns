package kjd.linkedin.iterator.diner;

import java.util.List;

import kjd.linkedin.iterator.Iterator;

public class DinerMenuIterator implements Iterator<String> {
    List<String> items;
    int index = 0;

    public DinerMenuIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.size() > index;
    }

    @Override
    public String next() {
        return items.get(index++);
    }
}
