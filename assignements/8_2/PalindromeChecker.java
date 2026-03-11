public class PalindromeChecker {

    public boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        // Remove punctuation and spaces, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}