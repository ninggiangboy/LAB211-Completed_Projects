package NumberSystem.controller;

import NumberSystem.utils.Converter;
import NumberSystem.view.Inputted;
import NumberSystem.view.Menu;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        String inputUser;
        String result;
        int choice;
        do {
            choice = Menu.getChoice(Menu.MAIN_OPTIONS);
            switch (choice) {
                case 1:
                    inputUser = Inputted.inputBaseNumber("Enter Binary Number: ", Inputted.BINARY_VALID, "0 or 1");
                    choice = Menu.getChoice(Menu.BINARY_OPTIONS);
                    result = Converter.convertBase(inputUser, 2, choice == 1 ? 10 : 16);
                    System.out.println("Output number: " + result);
                    break;
                case 2:
                    inputUser = Inputted.inputBaseNumber("Enter Decimal Number: ", Inputted.DECIMAL_VALID, "1 -> 9");
                    choice = Menu.getChoice(Menu.DECIMAL_OPTIONS);
                    result = Converter.convertBase(inputUser, 10, choice == 1 ? 2 : 16);
                    System.out.println("Output number: " + result);
                    break;
                case 3:
                    inputUser = Inputted.inputBaseNumber("Enter Hexa Number: ", Inputted.HEXADECIMAL_VALID,
                            "1 -> 9 or A -> Z");
                    choice = Menu.getChoice(Menu.HEXADECIMAL_OPTIONS);
                    result = Converter.convertBase(inputUser, 16, choice == 1 ? 2 : 10);
                    System.out.println("Output number: " + result);
                    break;
                case 4:
                    return;
            }
            System.out.println();
        } while (true);
    }
}
