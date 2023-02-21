package TPBank.view;

import java.util.Scanner;

/**
 *
 * @author duykhanh
 */
public class Inputted {
    private static final Scanner INPUT = new Scanner(System.in);

    public static int inputInt(String message, int min, int max) {
        if (min > max) {
            max = max + min;
            min = max - min;
            max = max - min;
        }

        System.out.print(message);
        int inputUser;

        do {
            try {
                inputUser = Integer.parseInt(INPUT.nextLine().trim());
                if (inputUser < min || inputUser > max) {
                    System.err.println("Input out of range. Enter a value between " + min + " and " + max + ":");
                } else
                    return inputUser;
            } catch (NumberFormatException e) {
                System.err.println("Invalid integer.");
            }
            System.out.print("Enter again: ");
        } while (true);
    }

    public static String inputString(String message) {
        System.out.print(message);
        return INPUT.nextLine().trim();
    }
}
