package TPBank.view;

public class Menu {
    public static final String[] MAIN_OPTIONS = {
            "Vietnamese",
            "English",
            "Exit"
    };

    public static int getChoice(String[] options) {
        int minChoice = 1;
        int maxChoice = options.length;
        for (int i = 0; i < options.length; i++) {
            System.out.printf("<%d> %s%n", i + 1, options[i]);
        }

        String msg = "Choice [" + minChoice + " - " + maxChoice + "]: ";
        return Inputted.inputInt(msg, minChoice, maxChoice);
    }
}
