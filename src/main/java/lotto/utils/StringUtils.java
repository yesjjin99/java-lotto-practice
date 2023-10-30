package lotto.utils;

import lotto.utils.constant.ErrorMessage;

public class StringUtils {
    public static int convertStringToInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_INPUT_NUMBER);
        }
    }
}
