package kjd.linkedin.iterator.cafe;

import java.util.List;

import kjd.linkedin.iterator.Iterator;

public class CafeMenuIterator implements Iterator<String> {
    String[] items;
    int index = 0;

    public CafeMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public String next() {
        return items[index++];
    }
}
