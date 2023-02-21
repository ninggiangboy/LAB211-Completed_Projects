package LinearSearch;

import java.util.Scanner;

/**
 *
 * @author duykhanh
 */
public class Inputted {
    private static Scanner input = new Scanner(System.in);

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
}
