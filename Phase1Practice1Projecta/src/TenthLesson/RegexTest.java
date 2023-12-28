package TenthLesson;
import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testEmailValidation() {
        assertTrue(isValidEmail("john.doe@example.com"));
        assertTrue(isValidEmail("jane_doe123@gmail.com"));
        assertFalse(isValidEmail("invalid.email@com"));
        assertFalse(isValidEmail("missing.at.sign.com"));
    }

    @Test
    public void testPhoneNumberValidation() {
        assertTrue(isValidPhoneNumber("+1-555-123-4567"));
        assertTrue(isValidPhoneNumber("555-555-5555"));
        assertFalse(isValidPhoneNumber("123-456-789")); // Invalid format
        assertFalse(isValidPhoneNumber("abc-def-ghij")); // Non-numeric characters
    }

    // Add more test methods for other regular expressions as needed

    private boolean isValidEmail(String email) {
        // Define your email pattern
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Define your phone number pattern
        String phoneRegex = "^\\+?[0-9-]+$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // Add more validation methods for other regular expressions as needed
}

