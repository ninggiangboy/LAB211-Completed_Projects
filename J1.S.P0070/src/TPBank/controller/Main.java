package TPBank.controller;

import TPBank.model.EBank;
import TPBank.view.Menu;

import java.util.Locale;

/**
 *
 * @author duykhanh
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-------Login Program-------");
        EBank tpbank = new EBank();
        switch (Menu.getChoice(Menu.MAIN_OPTIONS)) {
            case 1:
                tpbank.setLocate(new Locale("vi", "VN"));
                break;
            case 2:
                tpbank.setLocate(Locale.ENGLISH);
                break;
            case 3:
                return;
        }
        Login.loginDisplay(tpbank);
    }
}
