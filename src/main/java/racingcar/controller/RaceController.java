package racingcar.controller;

import racingcar.Race;
import racingcar.RacingGame;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RaceController {
    private InputView inputView;
    private OutputView outputView;
    public RaceController (InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        List<String> inputCarNameList = InputView.readCarNames();
        Cars cars = new Cars(inputCarNameList);
        Integer round = InputView.readRounds();

        RacingGame racingGame = new RacingGame(outputView);
        racingGame.run(cars, round);
    }
}
