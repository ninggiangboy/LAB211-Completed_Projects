package NumberSystem.utils;

import java.math.BigInteger;
import java.util.Stack;

/**
 *
 * 
 * @author duykhanh
 */
public class Converter {
    public static String convertFromDEC(BigInteger number, int base) {
        if (number.compareTo(BigInteger.ZERO) == 0)
            return "0";
        Stack<Integer> stack = new Stack<>();
        int remainder;
        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] quotientAndRemainder = number.divideAndRemainder(BigInteger.valueOf(base));
            remainder = quotientAndRemainder[1].intValue();
            stack.push(remainder);
            number = quotientAndRemainder[0];
        }
        StringBuilder result = new StringBuilder();
        int popped;
        char c;
        while (!stack.isEmpty()) {
            popped = stack.pop();
            if (popped > 9) {
                c = (char) ('A' + popped - 10);
                result.append(c);
            } else
                result.append(popped);
        }
        return result.toString();
    }

    public static BigInteger convertToDEC(String number, int base) {
        number = new StringBuilder(number).reverse().toString();
        BigInteger result = BigInteger.ZERO;
        int digit;
        for (int i = 0; i < number.length(); i++) {
            digit = toDigit(number.charAt(i), base);
            result = result.add(BigInteger.valueOf(digit).multiply(BigInteger.valueOf(base).pow(i)));
        }
        return result;
    }

    public static String convertBase(String inputUser, int inputBase, int outputBase) {
        BigInteger base10 = convertToDEC(inputUser, inputBase);
        if (outputBase == 10)
            return base10 + "";
        String output = convertFromDEC(base10, outputBase);
        return output;
    }

    public static int toDigit(char c, int base) {
        if (base == 16) {
            int result = Character.isDigit(c) ? c - '0' : Character.toUpperCase(c) - 'A' + 10;
            return result;
        }
        return c - '0';
    }
}