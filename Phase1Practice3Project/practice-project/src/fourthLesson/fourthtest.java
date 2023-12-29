package fourthLesson;


import org.junit.Test;
import static org.junit.Assert.*;

public class fourthtest{

    @Test
    public void testDefaultConstructor() {
    	fourthMain obj = new fourthMain();
        assertEquals(0, obj.getValue());
    }

    @Test
    public void testParameterizedConstructor() {
    	fourthMain obj = new fourthMain(42);
        assertEquals(42, obj.getValue());
    }

    @Test
    public void testCopyConstructor() {
    	fourthMain originalObj = new fourthMain(99);
    	fourthMain copyConstructorObj = new fourthMain(originalObj);
        assertEquals(originalObj.getValue(), copyConstructorObj.getValue());
    }
}

