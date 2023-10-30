package lotto.utils.validation;

import java.util.List;
import lotto.utils.constant.ErrorMessage;

public class NumberValidation {
    public static void validateLottoNumberSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_LOTTO_SIZE);
        }
    }
}
