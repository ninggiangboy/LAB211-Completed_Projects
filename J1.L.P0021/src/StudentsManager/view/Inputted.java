package StudentsManager.view;

import java.util.Scanner;

/**
 *
 * @author duykhanh
 */
public class Inputted {
    private static final Scanner INPUT = new Scanner(System.in);

    public static final String VALID_ID = "^FU[0-9]{3}$";
    public static final String VALID_SEM = "^(SP|SU|FA)20(13|14|15|16|17|18|19|20|21|22|23)$";
    public static final String VALID_COURSE = "^(JAVA|\\.NET|C/C\\+\\+)$";

    public static int inputInt(String message, int min, int max) {
        // Swap the max, min value if the parameter passed to the function is wrong
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

    public static String inputStringNoBlack(String message) {
        System.out.print(message);
        String inputUser;
        do {
            inputUser = INPUT.nextLine().trim();
            if (inputUser.length() > 0)
                return inputUser;
            System.err.println("String can't be empty.");
            System.out.print("Try again: ");
        } while (true);
    }

    public static String inputPattern(String message, String pattern, String remind) {
        System.out.print(message);
        String inputUser;
        while (true) {
            inputUser = INPUT.nextLine().toUpperCase().trim();
            if (inputUser.matches(pattern))
                return inputUser;
            System.err.println(remind);
            System.out.print("Try again: ");
        }
    }

    public static boolean inputBoolean(String message) {
        System.out.print("\n" + message);
        while (true) {
            switch (INPUT.nextLine().toLowerCase()) {
                case "y":
                case "yes":
                    return true;
                case "n":
                case "no":
                    return false;
                default:
                    System.err.println("Only Y/N or Yes/No answer.");
                    System.out.print("Try again: ");
            }
        }
    }
}
