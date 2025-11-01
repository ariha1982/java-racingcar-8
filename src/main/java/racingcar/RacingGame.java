package racingcar;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.OutputView;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private OutputView outputView;
    public RacingGame(OutputView outputView) {
        this.outputView = outputView;
    }
    public void run(Cars cars, Integer round) {
        Race race = new Race();
        for(int i = 0; i < round ; i++) {
            race.run(cars);
            outputView.printRaceResult(cars);
        }

        outputView.printWinner(getWinner(cars));
    }

    public String getWinner(Cars cars) {
        Integer maxMovement = getMaxMovement(cars);
        return cars.getCarList().stream()
            .filter((car) -> car.getMovement().equals(maxMovement))
            .map(Car::getName)
            .collect(Collectors.joining(","));
    }

    private Integer getMaxMovement(Cars cars) {
        return cars.getCarList().stream()
            .map(Car::getMovement)
            .max(Comparator.naturalOrder())
            .orElse(0);
    }
}
