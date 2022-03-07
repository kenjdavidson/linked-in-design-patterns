package kjd.linkedin.iterator;

import org.junit.Test;

import kjd.linkedin.iterator.cafe.CafeMenu;
import kjd.linkedin.iterator.diner.DinerMenu;

public class MenuIteratorTest {
    @Test 
    public void testIterator() {
        Iterator<String> cafe = new CafeMenu().iterator(); 
        while (cafe.hasNext()) {
            System.out.println(cafe.next());
        }

        Iterator<String> diner = new DinerMenu().iterator(); 
        while (diner.hasNext()) {
            System.out.println(diner.next());
        }
    }
}
