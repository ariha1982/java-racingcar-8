package racingcar;

import racingcar.model.Cars;
import racingcar.utils.RandomNumberGenerator;

public class Race {
    public void run(Cars cars) {
        cars.getCarList().forEach((car -> {
            if (RandomNumberGenerator.IsMoveable()) {
                car.moveForward();
            }
        }));
    }
}
