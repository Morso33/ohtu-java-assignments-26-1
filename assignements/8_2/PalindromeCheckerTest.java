import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testSimplePalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("radar"));
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
    }

    @Test
    public void testNotPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testAnotherNotPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("openai"));
    }

    @Test
    public void testSingleCharacter() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("a"));
    }

    @Test
    public void testEmptyString() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome(""));
    }
}