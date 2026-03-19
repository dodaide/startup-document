import java.util.ArrayList;
import java.util.List;

public class LongestWords {
    public List<String> findLongestWords(String sentence) {
        List<String> longestWords = new ArrayList<>();
        int currentLongestLength = 0;
        String[] words = sentence.split("\\s+");
        if (words != null && words.length > 0) {
            for (String word : words) {
                if (word.isEmpty()) {
                    continue;
                }
                // Duplicate check (theo logic bản C#).
                if (!longestWords.contains(word.toLowerCase())) {
                    if (word.length() > currentLongestLength) {
                        longestWords.clear();
                        longestWords.add(word.toLowerCase());
                        currentLongestLength = word.length();
                    } else if (word.length() == currentLongestLength) {
                        longestWords.add(word);
                    }
                }
            }
        }
        return longestWords;
    }
}
