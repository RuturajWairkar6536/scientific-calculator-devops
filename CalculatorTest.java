import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }

}
