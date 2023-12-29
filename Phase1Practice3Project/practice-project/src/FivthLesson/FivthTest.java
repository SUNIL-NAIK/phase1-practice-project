package FivthLesson;

 
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

;

	public class FivthTest
	{
	    @Test
	    public void testListImplementation() {
	        // Replace ArrayList with the specific implementation you want to test
	        List<String> collection = createCollection();

	        // Test adding elements
	        collection.add("Element 1");
	        collection.add("Element 2");

	        assertEquals(2, collection.size());
	        assertTrue(collection.contains("Element 1"));
	        assertTrue(collection.contains("Element 2"));

	        // Test removing elements
	        collection.remove("Element 1");
	        assertEquals(1, collection.size());
	        assertFalse(collection.contains("Element 1"));
	        assertTrue(collection.contains("Element 2"));

	        // Test clearing the collection
	        collection.clear();
	        assertEquals(0, collection.size());
	        assertFalse(collection.contains("Element 2"));
	    }

	    // Create the collection to be tested
	    private List<String> createCollection() {
	        // Replace ArrayList with the specific implementation you want to test
	        return new java.util.ArrayList<>();
	    }

	    // Add more tests as needed

	}
