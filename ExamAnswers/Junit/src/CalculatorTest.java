import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));

        // Test for negative numbers
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.substract(5, 3));

        // Test for negative numbers
        assertEquals(5, calculator.substract(2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));

        // Test for negative numbers
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));

        // Test for negative numbers
        assertEquals(-2, calculator.divide(6, -3));

        // Test for division by zero to see if illegal argument exception is thrown
        try {
            calculator.divide(6, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
