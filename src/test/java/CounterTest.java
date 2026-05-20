import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CounterTest {

    private Counter counter;

    @BeforeEach
    public void setUp() throws Exception{
        counter = new Counter();
    }

    @Test
    public void testIncrement(){
        assertEquals("Counter.increment does not work correctly", 1, counter.increment());
        assertEquals("Counter.increment does not work correctly", 2, counter.increment());
    }

    @Test
    public void testDecrement(){
        assertEquals("Counter.decrement does not work correctly", -1, counter.decrement());
        assertEquals("Counter.decrement does not work correctly", -2, counter.decrement());
    }
}
