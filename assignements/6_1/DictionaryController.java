public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();

        // Hardcoded sample data
        dictionary.addWord("java", "A high-level programming language.");
        dictionary.addWord("computer", "An electronic device for storing and processing data.");
        dictionary.addWord("dictionary", "A reference book containing words and their meanings.");
    }

    public String search(String word) {

        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }

        try {
            return dictionary.searchWord(word);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
