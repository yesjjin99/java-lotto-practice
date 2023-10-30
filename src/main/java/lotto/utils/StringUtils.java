package lotto.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lotto.utils.constant.Constant;
import lotto.utils.constant.ErrorMessage;

public class StringUtils {
    public static int convertStringToInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_NUMBER);
        }
    }

    public static List<Integer> split(String s) {
        return Arrays.asList(s.split(Constant.SPLIT_DELIMITER)).stream()
            .map(n -> convertStringToInt(n))
            .collect(Collectors.toList());
    }
}
