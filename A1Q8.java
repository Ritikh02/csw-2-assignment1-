
interface Vehicle {
    void accelerate();
    void brake();
}
class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking");
    }
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
}
public class A1Q8 {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.brake();
        car.accelerate(60);
        car.accelerate(80, 10);
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate(20);
        bicycle.accelerate(30, 5);
    }
}
