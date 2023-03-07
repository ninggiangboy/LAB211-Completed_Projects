package WordsCounter.utils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author duykhanh
 */
public class Counter {
    public static void wordsCount(String content) {
        // String[] words = content.split("\\W+|\\d+|\\s+");
        StringTokenizer tokenizer = new StringTokenizer(content, " \t\n\r\f,.?!;:+-=\"'()[]{}<>\\/");

        Map<String, Integer> wordCounts = new HashMap<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (!wordCounts.containsKey(word)) {
                wordCounts.put(word, 0);
            }
            wordCounts.put(word, wordCounts.get(word) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (String word : wordCounts.keySet()) {
            result.append(word).append("=").append(wordCounts.get(word)).append(", ");
        }
        System.out.println("{" + result.substring(0, result.length() - 2) + "}");
    }

    public static void charsCount(String content) {
        int[] count = new int[26];

        for (char c : content.toLowerCase().toCharArray()) {
            if (Character.isLetter(c))
                count[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                result.append((char) (i + 'a')).append("=").append(count[i]).append(", ");
        }
        System.out.println("{" + result.substring(0, result.length() - 2) + "}");
    }
}
