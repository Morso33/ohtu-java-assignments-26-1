import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {

    private StringManipulator sm;

    @BeforeEach
    void setUp() {
        sm = new StringManipulator();
    }

    @Test
    void testConcatenate() {
        String result = sm.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
    }

    @Test
    void testFindLength() {
        int length = sm.findLength("Hello");
        assertEquals(5, length);
    }

    @Test
    void testConvertToUpperCase() {
        String result = sm.convertToUpperCase("hello");
        assertEquals("HELLO", result);
    }

    @Test
    void testConvertToLowerCase() {
        String result = sm.convertToLowerCase("HELLO");
        assertEquals("hello", result);
    }

    @Test
    void testContainsSubstringTrue() {
        boolean result = sm.containsSubstring("Hello World", "World");
        assertTrue(result);
    }

    @Test
    void testContainsSubstringFalse() {
        boolean result = sm.containsSubstring("Hello World", "Java");
        assertFalse(result);
    }
}