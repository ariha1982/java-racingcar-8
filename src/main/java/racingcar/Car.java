package racingcar;

public class Car {
    private String name;
    private int movement;

    public Car (String name) {
        this.name = name;
        this.movement = 0;
    }

    public void moveForward() {
        this.movement++;
    }
}