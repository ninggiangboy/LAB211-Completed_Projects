package TPBank.model;

import TPBank.controller.Message;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

/**
 *
 * @author duykhanh
 */
public class EBank {

    public EBank() {
    }

    private ResourceBundle language;

    private final String VALID_ACCOUNTNUMBER = "^\\d{10}$";
    private final String VALID_PASSWORD_LENGTH = "^.{8,31}$";
    private final String VALID_PASSWORD_ALPHANUMERIC = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
    private final String VALID_CAPTCHA = "^[A-Z0-9]{1}$";

    private final String CHAR_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public void setLocate(Locale locate) {
        String baseName = "TPBank//model//messages";
        language = ResourceBundle.getBundle(baseName, locate);
    }

    public ResourceBundle getLanguage() {
        return language;
    }

    public String checkAccountNumber(String accountNumber) {
        if (!accountNumber.matches(VALID_ACCOUNTNUMBER))
            return Message.getMessage(language, "remindAccountNumber");
        return null;
    }

    public String checkPassword(String password) {
        if (!password.matches(VALID_PASSWORD_LENGTH)) {
            return Message.getMessage(language, "remindLengthPassword");
        }
        if (!password.matches(VALID_PASSWORD_ALPHANUMERIC)) {
            return Message.getMessage(language, "remindAlphanumericPassword");
        }
        return null;
    }

    public String generateCaptchaText(int captchaLength) {
        StringBuilder captchaText = new StringBuilder();
        int randomNumber;
        char randomChar;
        for (int i = 0; i < captchaLength; i++) {
            randomNumber = getRandomNumber(captchaLength);
            randomChar = CHAR_LIST.charAt(randomNumber);
            captchaText.append(randomChar);
        }
        return captchaText.toString();
    }

    private int getRandomNumber(int max) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(max);
        return randomInt % max;
    }

    public String checkCaptcha(String captchaGenerate, String captchaInput) {
        if (!captchaInput.matches(VALID_CAPTCHA)) {
            return Message.getMessage(language, "remindCaptcha");
        }
        if (!captchaGenerate.startsWith(captchaInput)) {
            return Message.getMessage(language, "errWrongCaptcha");
        }
        return null;
    }
}
