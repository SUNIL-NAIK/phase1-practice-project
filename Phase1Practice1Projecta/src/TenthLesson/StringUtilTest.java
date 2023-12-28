package TenthLesson;

import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void testConcatenateStrings() {
        StringUtilTest stringUtil = new         StringUtilTest();
        
        // Test case 1
        String result1 = stringUtil.concatenateStrings("Hello", "World");
        assertEquals("HelloWorld", result1);

        // Test case 2
        String result2 = stringUtil.concatenateStrings("Java", "Programming");
        assertEquals("JavaProgramming", result2);

        // Test case 3
        String result3 = stringUtil.concatenateStrings("", "Test");
        assertEquals("Test", result3);
    }

    private String concatenateStrings(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    public void testReverseString() {
        StringUtilTest stringUtil = new    StringUtilTest();

        // Test case 1
        String result1 = stringUtil.reverseString("Hello");
        assertEquals("olleH", result1);

        // Test case 2
        String result2 = stringUtil.reverseString("Java");
        assertEquals("avaJ", result2);

        // Test case 3
        String result3 = stringUtil.reverseString("");
        assertEquals("", result3);
    }

	private String reverseString(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
