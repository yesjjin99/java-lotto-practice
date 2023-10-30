package lotto.domain;

import java.util.List;
import lotto.utils.StringUtils;
import lotto.utils.validation.NumberValidation;

public class WinningNumber {
    private final List<Integer> winningNumbers;
    private final int bonusNumber;

    public WinningNumber(String winning, int bonusNumber) {
        this.winningNumbers = StringUtils.split(winning);
        NumberValidation.validateLottoNumber(winningNumbers);
        this.bonusNumber = bonusNumber;
    }
}
