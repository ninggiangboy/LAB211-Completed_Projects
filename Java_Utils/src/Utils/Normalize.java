package Utils;

public class Normalize {
    /**
     * Removes all unnecessary whitespace from the given string by replacing all
     * consecutive whitespace
     * characters with a single space.
     *
     * @param input the input string to remove whitespace from.
     * @return the input string with all unnecessary whitespace removed.
     *
     * @throws IllegalArgumentException if the given input string is null.
     */
    public static String removeUnnecessaryBlank(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    /**
     * Removes all whitespace from the given string.
     *
     * @param input the input string to remove whitespace from.
     * @return the input string with all whitespace removed.
     *
     * @throws IllegalArgumentException if the given input string is null.
     */
    public static String removeAllBlank(String input) {
        return input.trim().replaceAll("\\s+", "");
    }
}
