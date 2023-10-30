package lotto.controller;

import lotto.domain.Lottos;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private Lottos lottos;

    private void createLotto() {
        String amount = InputView.getPurchaseAmount();
        lottos = new Lottos(amount);
        OutputView.printLottos(lottos.getLottoList(), lottos.getLottoCount());
    }
}
