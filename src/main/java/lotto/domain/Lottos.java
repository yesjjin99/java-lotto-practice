package lotto.domain;

import java.util.List;
import java.util.stream.IntStream;
import lotto.domain.generator.LottoGenerator;

public class Lottos {
    private List<Lotto> lottoList;
    private Amount amount;

    public Lottos(String amount) {
        this.amount = new Amount(amount);
        createLottoList();
    }

    private void createLottoList() {
        IntStream.range(0, amount.getLottoCount())
            .forEach(i -> lottoList.add(LottoGenerator.createLotto()));
    }

    public List<Lotto> getLottoList() {
        return lottoList;
    }

    public int getPurchaseAmount() {
        return amount.getPurchaseAmount();
    }

    public int getLottoCount() {
        return amount.getLottoCount();
    }
}
