package lotto.domain;

import java.util.List;
import lotto.utils.NumberUtils;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = NumberUtils.sorted(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
