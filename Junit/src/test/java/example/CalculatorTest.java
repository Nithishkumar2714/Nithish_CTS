package example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        System.out.println("Result = " + result);

        assertEquals(30, result);
    }
}