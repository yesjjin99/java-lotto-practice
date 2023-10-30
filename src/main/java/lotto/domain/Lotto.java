package lotto.domain;

import java.util.List;
import lotto.utils.validation.NumberValidation;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        NumberValidation.validateLottoNumberSize(numbers);
        this.numbers = numbers;
    }

    // TODO: 추가 기능 구현
}
