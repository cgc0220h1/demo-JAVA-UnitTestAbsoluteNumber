import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void findAbsoluteWith0() {
        int number = 0;
        int expected = 0;
        int actual = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,actual);
    }

    @Test
    void findAbsoluteWith1() {
        int number = 1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,actual);
    }

    @Test
    void findAbsoluteWithNegative1() {
        int number = -1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,actual);
    }
}