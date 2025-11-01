package racingcar.view;

import racingcar.model.Cars;

public class OutputView {
    public void printRaceResult(Cars cars) {
        cars.getCarList()
            .forEach(car -> {
                System.out.println(car.getName() + " : " + "-".repeat(car.getMovement()));
            });
    }

    public void printWinner(String result) {
        System.out.println(result);
    }
}
