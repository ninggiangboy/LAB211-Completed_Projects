package TPBank.controller;

import java.util.ResourceBundle;

/**
 *
 * @author duykhanh
 */
public class Message {
    public static String getMessage(ResourceBundle language, String key) {
        return language.getString(key);
    }
}
