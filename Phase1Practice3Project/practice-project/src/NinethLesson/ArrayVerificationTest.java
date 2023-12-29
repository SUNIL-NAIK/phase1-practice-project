package NinethLesson;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayVerificationTest {

    @Test
    public void testArrayOperations() {
        int[] myArray = new int[5];

        // Populating the array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        // Accessing and updating elements
        assertEquals(3, myArray[2]);
        myArray[2] = 100;
        assertEquals(100, myArray[2]);

        // Verifying array length
        assertEquals(5, myArray.length);

        // Iterating through the array using enhanced for loop
        int sum = 0;
        for (int element : myArray) {
            sum += element;
        }
        assertEquals(109, sum);
    }

    @Test
    public void testPrintArray() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayVerification.printArray(arr);
        // You may manually check the printed output in the console
    }
}
