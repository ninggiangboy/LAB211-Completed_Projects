package NormalizeText.utils;

/**
 *
 * @author duykhanh
 */
public class Normalize {
    public static String NormalizeText(String text) {
        text = text.trim();
        if (text.isEmpty())
            return "";

        text = text.replaceAll("[^\\S\\r\\n]+", " ");

        text = text.replaceAll("\n\n+", "\n");

        text = text.replaceAll("[^\\S\\r\\n]*,[^\\S\\r\\n]*", ", ");
        text = text.replaceAll("[^\\S\\r\\n]*\\.[^\\S\\r\\n]*", ". ");
        text = text.replaceAll("[^\\S\\r\\n]*:[^\\S\\r\\n]*", ": ");

        text = text.replaceAll("[^\\S\\r\\n]*\"" + "\\s*(.*?)\\s*" + "\"[^\\S\\r\\n]*", " \"" + "$1" + "\" ");

        text = text.replaceAll("\n\\s*", "\n");

        text = capitalizeWordAfterDot(text);
        text = capitalizeWordAfterNewline(text);

        return text.endsWith(".") ? text : text + ".";
    }

    public static String capitalizeWordAfterDot(String input) {
        StringBuilder output = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '.') {
                output.append(currentChar);
                capitalizeNext = true;
            } else if (Character.isWhitespace(currentChar)) {
                output.append(currentChar);
            } else {
                if (capitalizeNext) {
                    output.append(Character.toUpperCase(currentChar));
                    capitalizeNext = false;
                } else {
                    output.append(currentChar);
                }
            }
        }
        return output.toString();
    }

    public static String capitalizeWordAfterNewline(String text) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (capitalizeNext && Character.isLetter(currentChar)) {
                result.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            } else {
                result.append(currentChar);
            }
            if (currentChar == '\n') {
                capitalizeNext = true;
            }
        }
        return result.toString();
    }
}
