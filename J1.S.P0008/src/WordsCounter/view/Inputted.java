package WordsCounter.view;

import java.util.Scanner;

/**
 *
 * @author duykhanh
 */
public class Inputted {
    private static Scanner input = new Scanner(System.in);

    public static String inputStringNoBlack(String message) {
        System.out.print(message);
        String inputUser;
        do {
            inputUser = input.nextLine().trim();
            if (inputUser.length() > 0)
                return inputUser;
            System.err.println("String can't be empty.");
            System.out.print("Try again: ");
        } while (true);
    }
}
