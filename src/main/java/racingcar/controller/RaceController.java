package racingcar.controller;

import racingcar.RacingGame;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RaceController {
    private final InputView inputView;
    private final OutputView outputView;
    public RaceController (InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        List<String> inputCarNameList = inputView.readCarNames();
        Cars cars = new Cars(inputCarNameList);
        Integer round = inputView.readRounds();

        RacingGame racingGame = new RacingGame(outputView);
        racingGame.run(cars, round);
    }
}
