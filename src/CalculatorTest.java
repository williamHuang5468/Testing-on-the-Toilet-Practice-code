import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() {
	Calculator calculator = new Calculator();
	assertEquals(3, calculator.add(2, 1));
	assertEquals(2, calculator.add(2, 0));
	assertEquals(1, calculator.add(2, -1));
    }

}
