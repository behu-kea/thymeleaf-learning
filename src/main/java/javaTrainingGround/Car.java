package javaTrainingGround;

public class Car extends Wheels implements CarInterface {
    public int speed;
    public String name;


    public Car(int speed, String name) {
        super("Michelin", 0.8);

        this.speed = speed;
        this.name = name;
    }

    public boolean isDriving() {
        return speed != 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

