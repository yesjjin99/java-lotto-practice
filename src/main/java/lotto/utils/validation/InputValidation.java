package lotto.utils.validation;

import lotto.utils.constant.Constant;
import lotto.utils.constant.ErrorMessage;

public class InputValidation {
    public static void validateAmountDivisible(int amount) {
        if (amount % Constant.LOTTO_AMOUNT == 0) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_AMOUNT_DIVIDED);
        }
    }
}
