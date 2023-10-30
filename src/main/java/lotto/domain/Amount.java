package lotto.domain;

import lotto.utils.StringUtils;
import lotto.utils.constant.Constant;
import lotto.utils.validation.InputValidation;

public class Amount {
    private final int purchaseAmount;
    private final int lottoCount;

    public Amount(String amount) {
        this.purchaseAmount = StringUtils.convertStringToInt(amount);
        this.lottoCount = calculateCount();
    }

    private int calculateCount() {
        InputValidation.validateAmountDivisible(purchaseAmount);
        return purchaseAmount / Constant.LOTTO_AMOUNT;
    }
}
