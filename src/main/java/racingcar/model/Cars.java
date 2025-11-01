package racingcar.model;

import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars (List<String> carNameList) {
        this.cars = parseCarList(carNameList);
    }

    private List<Car> parseCarList(List<String> carNameList) {
        return carNameList.stream()
            .map(Car::new)
            .toList();
    }

    public List<Car> getCarList() {
        return cars;
    }
}
