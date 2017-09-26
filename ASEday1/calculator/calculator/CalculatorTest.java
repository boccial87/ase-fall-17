package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
    }
    
    @Test
    public void testSumFirstNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(-3,5);
        assertEquals(2, sum);
    }
    
    @Test
    public void testSumSecondNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,-3);
        assertEquals(0, sum);
    }
    
    @Test
    public void testSumBothNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(-3,-3);
        assertEquals(-6, sum);
    }
    
    @Test
    public void testSubtract() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(3,3);
        assertEquals(0, sub);
    }
    
    @Test
    public void testSubtractFirstNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(-3,5);
        assertEquals(-8, sub);
    }
    
    @Test
    public void testSubtractSecondNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(3,-3);
        assertEquals(6, sub);
    }
    
    @Test
    public void testSubtractBothNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(-3,-3);
        assertEquals(0, sub);
    }
    
    @Test
    public void testDivisionEven() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(6,3);
        assertEquals(2, sum);
    }

    @Test
    public void testDivisionOdd() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(7,3);
        assertEquals(2, sum);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        calculator.divide(3,0);
    }
    
    @Test
    public void testDivisionFirstNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(-9,3);
        assertEquals(-3, sum);
    }
    
    @Test
    public void testDivisionSecondNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(9,-3);
        assertEquals(-3, sum);
    }
    
    @Test
    public void testDivisionBothNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(-9,-3);
        assertEquals(3, sum);
    }

    @Test
    public void testMultiplicationFirstNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mul = calculator.multiply(-2,3);
        assertEquals(-6, mul);
    }
    
    @Test
    public void testMultiplicationSecondNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mul = calculator.multiply(2,-3);
        assertEquals(-6, mul);
    }
    
    @Test
    public void testMultiplicationBothNegative() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mul = calculator.multiply(-2,-3);
        assertEquals(6, mul);
    }
    
    @Test
    public void testMultiplicationByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mul = calculator.multiply(9,0);
        assertEquals(0, mul);
    }
}