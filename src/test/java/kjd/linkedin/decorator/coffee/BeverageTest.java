package kjd.linkedin.decorator.coffee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BeverageTest {
    @Test
    public void testDarkRoast() {
        Beverage dr = new DarkRoast();
        assertEquals("Dark Roast", dr.getDescription());
    }

    @Test
    public void testDarkRoastWithCreme() {
        Beverage dr = new Creme(new DarkRoast());
        assertEquals("Dark Roast; Creme", dr.getDescription());
    }

    @Test 
    public void testDarkRoastWithCremeAndWhip() {
        Beverage dr = new Whip(new Creme(new DarkRoast()));
        assertEquals("Dark Roast; Creme; Whip", dr.getDescription());
    }
}
