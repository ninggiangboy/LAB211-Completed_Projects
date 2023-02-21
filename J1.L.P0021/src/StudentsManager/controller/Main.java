package StudentsManager.controller;

import StudentsManager.view.Menu;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("========== STUDENT MANAGEMENT ==========");
        do {
            switch (Menu.getChoice(Menu.MAIN_OPTIONS)) {
                case 1:
                    manager.createStudent();
                    break;
                case 2:
                    manager.findStudent();
                    break;
                case 3:
                    manager.editStudent();
                    break;
                case 4:
                    manager.printReport();
                    break;
                case 5:
                    System.out.println("Thanks for using!");
                    return;
            }
        } while (true);
    }
}
