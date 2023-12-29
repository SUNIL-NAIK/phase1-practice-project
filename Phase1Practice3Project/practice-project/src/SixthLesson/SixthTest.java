package SixthLesson;

 
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class SixthTest {

    @Test
    public void testMapImplementation() {
        // Change this line to test a different map implementation
        Map<String, Integer> map = new HashMap<>();

        // Test put and get operations
        map.put("one", 1);
        map.put("two", 2);
        assertEquals(1, (int) map.get("one"));
        assertEquals(2, (int) map.get("two"));

        // Test size
        assertEquals(2, map.size());

        // Test containsKey and containsValue
        assertTrue(map.containsKey("one"));
        assertFalse(map.containsKey("three"));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(3));

        // Test remove
        map.remove("one");
        assertNull(map.get("one"));
        assertEquals(1, map.size());

        // Test clear
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
    }

    // Add more tests based on the requirements of your application

    @Test
    public void testPerformance() {
        // You can add performance tests to check the speed of map operations
        Map<String, Integer> map = new HashMap<>();

        long startTime = System.currentTimeMillis();

        // Perform map operations here

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        assertTrue("Performance test failed: " + duration + " milliseconds", duration < 100); // Adjust the threshold as needed
    }
}

