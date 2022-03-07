package kjd.linkedin.strategy.duck;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RedheadDuckTest {
    Duck duck;

    @Before
    public void setup() {
        duck = new RedheadDuck();
    }

    @Test
    public void shouldQuack() {
        assertEquals("Quack!", duck.quack());
    }

    @Test
    public void shouldFly() {
        assertEquals("Fly with wings", duck.fly());
    }
}
