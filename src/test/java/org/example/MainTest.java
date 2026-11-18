
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    Main calculator = new Main();

    @Test
    public void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}
