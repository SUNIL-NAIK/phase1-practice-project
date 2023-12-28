package Practice1Project;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyMethodsTest {

    @Test
    public void testAdd() {
        MyClass1 myClass = new MyClass1();
        int result = myClass.add(5, 7);
        assertEquals(12, result);
    
    }

    @Test
    public void testConcatenate() {
        MyClass1 myClass = new MyClass1();
        String result = myClass.concatenate("Hello", "World");
        assertEquals("Hello World", result);
    }
}
