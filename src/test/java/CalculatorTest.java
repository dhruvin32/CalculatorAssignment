import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testEvaluate1(){
        Calculator calculator = new Calculator();
        assertEquals(6,calculator.evaluate(2,4));
    }

    @Test
    void testEvaluate2(){
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.evaluate(5,3));
    }
}