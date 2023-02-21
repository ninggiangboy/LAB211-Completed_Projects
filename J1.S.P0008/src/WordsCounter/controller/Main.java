package WordsCounter.controller;

import WordsCounter.utils.Counter;
import WordsCounter.view.Inputted;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        String content = Inputted.inputStringNoBlack("Enter your content: ");
        Counter.wordsCount(content);
        Counter.charsCount(content);
    }
}
