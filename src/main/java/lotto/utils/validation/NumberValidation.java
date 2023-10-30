package lotto.utils.validation;

import java.util.List;
import lotto.utils.constant.Constant;
import lotto.utils.constant.ErrorMessage;

public class NumberValidation {
    public static void validateLottoNumber(List<Integer> numbers) {
        validateNumberSize(numbers);
        validateNumberRange(numbers);
        validateNumberDuplicated(numbers);
    }

    public static void validateNumberSize(List<Integer> numbers) {
        if (numbers.size() != Constant.LOTTO_NUMBER_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_SIZE);
        }
    }

    public static void validateNumberRange(Integer n) {
        if (n < Constant.LOTTO_NUMBER_MIN || n > Constant.LOTTO_NUMBER_MAX) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_RANGE);
        }
    }

    public static void validateNumberRange(List<Integer> numbers) {
        numbers.forEach(NumberValidation::validateNumberRange);
    }

    public static void validateNumberDuplicated(List<Integer> numbers) {
        long count = numbers.stream().distinct().count();
        if (count != Constant.LOTTO_NUMBER_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATED_NUMBER);
        }
    }
}
