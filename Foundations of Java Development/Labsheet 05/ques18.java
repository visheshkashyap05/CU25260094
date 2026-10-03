class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

interface Electric {
    void chargeBattery();
}

class ElectricCar extends Car implements Electric {
    @Override
    public void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }
}

public class ques18 {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();

        car.start();
        car.drive();
        car.chargeBattery();
    }
}
