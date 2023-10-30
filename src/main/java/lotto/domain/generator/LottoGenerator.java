package lotto.domain.generator;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import lotto.domain.Lotto;
import lotto.utils.constant.Constant;
import lotto.utils.validation.NumberValidation;

public class LottoGenerator {
    public static List<Integer> createLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(Constant.LOTTO_NUMBER_MIN, Constant.LOTTO_NUMBER_MAX, Constant.LOTTO_NUMBER_COUNT);
    }

    public static Lotto createLotto() {
        List<Integer> numbers = createLottoNumbers();
        NumberValidation.validateLottoNumber(numbers);
        return new Lotto(numbers);
    }
}
