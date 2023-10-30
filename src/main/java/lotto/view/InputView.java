package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.constant.Message;

public class InputView {
    public static String getPurchaseAmount() {
        System.out.println(Message.INPUT_AMOUNT);
        return Console.readLine();
    }

    public static String getWinningNumber() {
        System.out.println(Message.INPUT_WINNING_NUMBER);
        return Console.readLine();
    }
}
