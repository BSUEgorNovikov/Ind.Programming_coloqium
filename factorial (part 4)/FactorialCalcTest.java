import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalcTest {

    @Test
    void testCalculateFactorials() {
        Vector<Long> expected = new Vector<>();

        expected.add(1L);
        expected.add(2L);
        expected.add(6L);
        expected.add(24L);

        FactorialCalc fc = new FactorialCalc();
        Vector<Long> actual = fc.calculateFactorials(4);

        assertEquals(expected, actual);
    }

    @Test
    void testCalculateFactorialsThrowsExp() {
        ArithmeticException expected = new ArithmeticException();

        FactorialCalc fc = new FactorialCalc();

        assertThrows(expected.getClass(),() -> fc.calculateFactorials(21));
    }
}