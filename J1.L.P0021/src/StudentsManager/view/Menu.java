package StudentsManager.view;

/**
 *
 * @author duykhanh
 */
public class Menu {
    public static final String[] MAIN_OPTIONS = {
            "Add new student",
            "Search student by name",
            "Update/Delete student",
            "Print report",
            "Quit"
    };
    public static final String[] EDIT_OPTIONS = {
            "Update student",
            "Delete student"
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
