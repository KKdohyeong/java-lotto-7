package lotto;

import lotto.controller.LottoController;
import lotto.view.InputView;
import lotto.view.OutputView;
import service.LottoResultService;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        LottoController lottoController = new LottoController(new InputView(), new OutputView(),new LottoResultService());
        lottoController.run();
    }
}
