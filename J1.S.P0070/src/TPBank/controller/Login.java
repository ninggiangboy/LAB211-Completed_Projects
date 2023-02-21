package TPBank.controller;

import TPBank.model.EBank;
import TPBank.view.Inputted;

import java.util.ResourceBundle;

/**
 *
 * @author duykhanh
 */
public class Login {
    public static void loginDisplay(EBank tpbank) {
        ResourceBundle language = tpbank.getLanguage();
        String messageReturn;
        String accountNumber;
        System.out.print(Message.getMessage(language, "msgInputAccountNumber"));
        do {
            accountNumber = Inputted.inputString("");
            messageReturn = tpbank.checkAccountNumber(accountNumber);
            if (messageReturn == null)
                break;
            System.err.println(messageReturn);
            System.out.print(Message.getMessage(language, "tryAgain"));
        } while (true);

        String password;
        System.out.print(Message.getMessage(language, "msgInputPassword"));
        do {
            password = Inputted.inputString("");
            messageReturn = tpbank.checkPassword(password);
            if (messageReturn == null)
                break;
            System.err.println(messageReturn);
            System.out.print(Message.getMessage(language, "tryAgain"));
        } while (true);

        String captchaGenerate = tpbank.generateCaptchaText(6);
        System.out.println("Captcha: " + captchaGenerate);
        String captchaInput;
        System.out.print(Message.getMessage(language, "msgInputCaptcha"));
        do {
            captchaInput = Inputted.inputString("");
            messageReturn = tpbank.checkCaptcha(captchaGenerate, captchaInput);
            if (messageReturn == null)
                break;
            System.err.println(messageReturn);
            System.out.print(Message.getMessage(language, "tryAgain"));
        } while (true);

        System.out.println(Message.getMessage(language, "loginSuccess"));
    }
}
