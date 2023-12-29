package ThirdLesson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathOperationsTest {

    @Test
    public void testAdd() {
        assertEquals(5, MathOperations.add(2, 3));
        assertEquals(-1, MathOperations.add(-2, 1));
        // Add more test cases for the add method
    }

    @Test
    public void testSubtract() {
        assertEquals(1, MathOperations.subtract(4, 3));
        assertEquals(5, MathOperations.subtract(8, 3));
        // Add more test cases for the subtract method
    }

    @Test
    public void testMultiply() {
        assertEquals(6, MathOperations.multiply(2, 3));
        assertEquals(-15, MathOperations.multiply(5, -3));
        // Add more test cases for the multiply method
    }

    // Add more test methods for other methods in MathOperations
}
