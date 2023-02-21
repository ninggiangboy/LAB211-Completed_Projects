package NormalizeText.controller;

import NormalizeText.utils.Files;
import NormalizeText.utils.Normalize;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        String origin = Files.readFileToString("input.txt");
        String normal = Normalize.NormalizeText(origin);
        Files.writeStringToFile("output.txt", normal);
    }
}
