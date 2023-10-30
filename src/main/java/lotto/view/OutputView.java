package lotto.view;

import java.util.List;
import lotto.domain.Lotto;
import lotto.utils.NumberUtils;
import lotto.utils.constant.Constant;
import lotto.utils.constant.Message;

public class OutputView {
    public static void printLottos(List<Lotto> numbers, int count) {
        printLottoCount(count);
        numbers.forEach(n -> printLottoNumber(n.getNumbers()));
    }

    private static void printLottoCount(int count) {
        System.out.println();
        System.out.println(count + Message.OUTPUT_LOTTO_COUNT);
    }

    private static void printLottoNumber(List<Integer> numbers) {
        String s = String.join(Constant.NUMBER_DELIMITER, NumberUtils.convertIntToStringArray(numbers));
        System.out.println("[" + s + "]");
    }
}
