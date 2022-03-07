package kjd.linkedin.strategy.duck;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RubberDuckTest {
    Duck duck;

    @Before
    public void setup() {
        duck = new RubberDuck();
    }

    @Test
    public void shouldNotQuack() {
        assertEquals("Squeek!", duck.quack());
    }

    @Test
    public void shouldNotFly() {
        assertEquals("Cannot fly", duck.fly());
    }
}
