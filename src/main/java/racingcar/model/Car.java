package racingcar.model;

public class Car {
    private String name;
    private Integer movement;

    public Car (String name) {
        this.name = name;
        this.movement = 0;
    }

    public void moveForward() {
        this.movement++;
    }

    public String getName() {
        return name;
    }

    public Integer getMovement() {
        return movement;
    }
}