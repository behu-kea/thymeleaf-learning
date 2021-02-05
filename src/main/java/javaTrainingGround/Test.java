package javaTrainingGround;

public class Test {
    public static void main(String[] args) {
        Car volvo = new Car(20, "Volvo");
        System.out.println(volvo.speed);
        volvo.setSpeed(30);
        System.out.println(volvo.speed);
        System.out.println(volvo.make);
        System.out.println(volvo.isDriving());
        volvo.setSpeed(0);
        System.out.println(volvo.isDriving());
    }
}
