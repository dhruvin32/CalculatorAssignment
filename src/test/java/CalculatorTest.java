import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testEvaluate1(){
        Calculator calculator = new Calculator();
        assertEquals(6,calculator.evaluate(2,4),"success if 6");
    }

    @Test
    void testEvaluate2(){
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.evaluate(5,5),"success if 10");
    }
}