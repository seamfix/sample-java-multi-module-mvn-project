import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void subtractTwoNumbers() {
        assertEquals(0, Calculator.subtractTwoNumbers(1, 1));
    }

}
