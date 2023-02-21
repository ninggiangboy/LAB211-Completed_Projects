package Calculator.view;

/**
 *
 * @author duykhanh
 */
public class Menu {
    public static final String[] MAIN_OPTIONS = {
            "Addition Matrix",
            "Subtraction Matrix",
            "Multiplication Matrix",
            "Exit"
    };

    public static int getChoice(String[] options) {
        int minChoice = 1;
        int maxChoice = options.length;
        // Display the options to the user
        for (int i = 0; i < options.length; i++) {
            System.out.printf("<%d> %s%n", i + 1, options[i]);
        }

        // Prompt the user for their choice
        String msg = "Choice [" + minChoice + " - " + maxChoice + "]: ";
        return Inputted.inputInt(msg, minChoice, maxChoice);
    }
}
