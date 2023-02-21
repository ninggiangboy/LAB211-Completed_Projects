package Calculator.controller;

import Calculator.view.Menu;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("----------Calculator Program----------");
            switch (Menu.getChoice(Menu.MAIN_OPTIONS)) {
                case 1:
                    Manager.additionMatrixes();
                    break;
                case 2:
                    Manager.subtractionMatrixes();
                    break;
                case 3:
                    Manager.multiplicationMatrixes();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
