package NumberSystem;

/**
 *
 * @author duykhanh
 */
public class Menu {

    public static final String[] MAIN_OPTIONS = {
            "Convert From Binary",
            "Convert From Decimal",
            "Convert From Hexa",
            "Quit"
    };

    public static final String[] BINARY_OPTIONS = {
            "Convert To Decimal",
            "Convert To Hexa",
    };

    public static final String[] DECIMAL_OPTIONS = {
            "Convert To Binary",
            "Convert To Hexa",
    };

    public static final String[] HEXADECIMAL_OPTIONS = {
            "Convert To Binary",
            "Convert To Decimal",
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
