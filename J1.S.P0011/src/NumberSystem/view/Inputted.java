package NumberSystem.view;

import java.util.Scanner;

/**
 *
 * @author duykhanh
 */
public class Inputted {
    private static final Scanner input = new Scanner(System.in);

    public static final String BINARY_VALID = "[0-1]*";
    public static final String DECIMAL_VALID = "[0-9]*";
    public static final String HEXADECIMAL_VALID = "[0-9A-F]*";

    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            max = max + min;
            min = max - min;
            max = max - min;
        }

        System.out.print(msg);
        int inputUser;

        do {
            try {
                inputUser = Integer.parseInt(input.nextLine().trim());

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

    public static String inputBaseNumber(String msg, String checkBase, String remind) {
        System.out.print(msg);
        String inputUser;
        do {
            inputUser = input.nextLine().trim().toUpperCase();
            if (inputUser.matches(checkBase)) {
                return inputUser;
            }
            System.err.println("Must be enter " + remind + ".");
            System.out.print("Enter again: ");
        } while (true);
    }
}
